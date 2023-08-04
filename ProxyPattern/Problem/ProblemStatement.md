Suppose you are maintaining a music streaming service like Spotify. You gotta have access control on who can add music to the centralized music library. Not every tom, dick and harry should be able to add songs. Only users with higher privileges i.e. admins should be able to add the songs to the library. All teh normal users can listen to the music tho. So you must have an access control on the library while adding songs.

Also, when a user requests for a specific song over a period of time, there is no need to go to the actual server and fetch the song. We can cache it for sometime in a cache, saving user some bandwidth. As long as the user is able to listen to the song, he/she doesn't where the song came from.

How do we achieve this?