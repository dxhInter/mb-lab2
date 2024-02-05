# Lab2: API Search Project

This project implements a favorites feature in an Android application, allowing users to mark and manage their favorite items. It leverages a `FavoriteService` interface for abstraction and `FavoriteServiceImpl` for concrete implementation, using `SharedPreferences` for persistent storage. The application uses `Intent` to transmit `Datum` objects from `API_Search` activity to `ResultDisplayActivity`, where item details are displayed. Users can toggle the favorite status of items, which is reflected in the UI updates and stored in `SharedPreferences`.

## Key Components:
- **FavoriteService Interface:** Defines the contract for favorite item operations.
- **FavoriteServiceImpl:** Implements favorite management functionality.
- **Intent Data Transfer:** Passes `Datum` objects between activities.

## Features:
- Add/remove favorite items.
- UI reflects favorite status.
- Persistent favorites list using `SharedPreferences`.
- Asynchronous image loading with Picasso.
- Logging with Slf4j.
- Double-checking method for singleton instantiation.
- Action bar with back button and set title dynamically.

## Dependencies:
- Picasso for image loading
- Slf4j for logging
- JUnit for testing

To set up, import into Android Studio with JDK 17 and Android SDK 31.