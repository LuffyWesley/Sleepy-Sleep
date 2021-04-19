## Pulling data from FitBit
1. We will be using [Retrofit](https://square.github.io/retrofit/) for parsing JSON in Android Studio
2. Go to [Fitbit Web API](https://dev.fitbit.com/build/reference/web-api/explore/#/)
3. Grab Curl info and adjust header and get info at `MyAPICall.java` file accordingly
4. Depending on which data you are looking to pull, you may need to adjust `DataModel.java`. Learn more here about [parsing nested Json objects](https://dev.to/collinsgichuki/parsing-nested-json-objects-in-android-478l)
5. Adjust `User.java` accordingly as well to pull data that you are interested in
6. Adjust `MainActivity.java` to print the text
