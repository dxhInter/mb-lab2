This project implements a favorites feature in an Android application, allowing users to mark and manage their favorite items.
The implementation utilizes the FavoriteService interface for defining behaviors and FavoriteServiceImpl for actual execution,
employing SharedPreferences and an ArrayList for the durable storage and management of favorite items.

The application uses Intent to transmit Datum objects from API_Search activity to ResultDisplayActivity, where item details
are displayed. Users can toggle the favorite status of items, which is reflected in the UI updates and stored in SharedPreferences.

The application using ActionBar enabling the back button, displaying the title, and setting the title dynamically.

Getting Started:
To use this project, import it into Android Studio. Ensure JDK 17 and Android SDK 31 are installed.

Dependencies:
- Picasso for image loading
- Slf4j for logging
- JUnit for testing

Key Components:
- FavoriteService Interface: Defines the contract for favorite item operations.
- FavoriteServiceImpl: Implements favorite management functionality.
- ResultDisplayActivity: Displays item details and allows users to toggle favorite status, also using action bar to enable back button and set title.
- Datum: Implement Serializable to allow for Intent transmission of item details.
- MobileComputingApplication: Initialize an instance with double-check locking and a global context for application to access application-level
resources or contexts, such as SharedPreferences.