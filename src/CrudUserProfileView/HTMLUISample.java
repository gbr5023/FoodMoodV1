package CrudUserProfileView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.concurrent.atomic.AtomicReference;
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.JSValue;
import com.teamdev.jxbrowser.chromium.events.FinishLoadingEvent;
import com.teamdev.jxbrowser.chromium.events.LoadAdapter;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;

public class HTMLUISample {

    public static void main(String[] args) {
        Browser browser = new Browser();
        BrowserView view = new BrowserView(browser);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(view, BorderLayout.CENTER);
        frame.setSize(700, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        browser.addLoadListener(new LoadAdapter() {
            @Override
            public void onFinishLoadingFrame(FinishLoadingEvent event) {
                if (event.isMainFrame()) {
                    // HTML content has been loaded completely.
                }
            }
        });
        
        browser.loadHTML("<html>\n" +
"  <head></head>\n" +
"  <body>\n" +
"    <script type=\"text/javascript\">\n" +
"      function handleClientLoad() {\n" +
"        // Loads the client library and the auth2 library together for efficiency.\n" +
"        // Loading the auth2 library is optional here since `gapi.client.init` function will load\n" +
"        // it if not already loaded. Loading it upfront can save one network request.\n" +
"        gapi.load('client:auth2', initClient);\n" +
"      }\n" +
"\n" +
"      function initClient() {\n" +
"        // Initialize the client with API key and People API, and initialize OAuth with an\n" +
"        // OAuth 2.0 client ID and scopes (space delimited string) to request access.\n" +
"        gapi.client.init({\n" +
"            apiKey: 'pTxboLl-xvaoCk3Mog137O4n',\n" +
"            discoveryDocs: [\"https://people.googleapis.com/$discovery/rest?version=v1\"],\n" +
"            clientId: '113166401669-245ijd914nm5k37gki5snmc9ic6ctnru.apps.googleusercontent.com',\n" +
"            scope: 'profile'\n" +
"        }).then(function () {\n" +
"          // Listen for sign-in state changes.\n" +
"          gapi.auth2.getAuthInstance().isSignedIn.listen(updateSigninStatus);\n" +
"\n" +
"          // Handle the initial sign-in state.\n" +
"          updateSigninStatus(gapi.auth2.getAuthInstance().isSignedIn.get());\n" +
"        });\n" +
"      }\n" +
"\n" +
"      function updateSigninStatus(isSignedIn) {\n" +
"        // When signin status changes, this function is called.\n" +
"        // If the signin status is changed to signedIn, we make an API call.\n" +
"        if (isSignedIn) {\n" +
"          makeApiCall();\n" +
"        }\n" +
"      }\n" +
"\n" +
"      function handleSignInClick(event) {\n" +
"        // Ideally the button should only show up after gapi.client.init finishes, so that this\n" +
"        // handler won't be called before OAuth is initialized.\n" +
"        gapi.auth2.getAuthInstance().signIn();\n" +
"      }\n" +
"\n" +
"      function handleSignOutClick(event) {\n" +
"        gapi.auth2.getAuthInstance().signOut();\n" +
"      }\n" +
"\n" +
"      function makeApiCall() {\n" +
"        // Make an API call to the People API, and print the user's given name.\n" +
"        gapi.client.people.people.get({\n" +
"          'resourceName': 'people/me',\n" +
"          'requestMask.includeField': 'person.names'\n" +
"        }).then(function(response) {\n" +
"          console.log('Hello, ' + response.result.names[0].givenName);\n" +
"        }, function(reason) {\n" +
"          console.log('Error: ' + reason.result.error.message);\n" +
"        });\n" +
"      }\n" +
"    </script>\n" +
"    <script async defer src=\"https://apis.google.com/js/api.js\"\n" +
"      onload=\"this.onload=function(){};handleClientLoad()\"\n" +
"      onreadystatechange=\"if (this.readyState === 'complete') this.onload()\">\n" +
"    </script>\n" +
"    <button id=\"signin-button\" onclick=\"handleSignInClick()\">Sign In</button>\n" +
"    <button id=\"signout-button\" onclick=\"handleSignOutClick()\">Sign Out</button>\n" +
"  </body>\n" +
"</html>");
    }
}
