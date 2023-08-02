Suppose we're creating an application that draws shapes. The first version of your app draws only circles, so the bulk of your code lies in the **Circle** class.

After a while, your app grows in popularity. You recieve requests from new clients to incorporate Square drawing into the app.

Great, right? But how abou the code? As of now, most of the code is tightly coupled to **Circle** class. Adding **Square** into the app would require making changes to the entire codebase. Moreover, if another request for another shape arises in the future, we gotta do all these changes again to incorporate one more shape.

This will result in nasty code, riddled with several conditionals that switch the app's behavior depending on the class of shape objects.