# Fast Food Hub 🍔🍟

A modern, high-performance Android application demonstrating the implementation of **RecyclerView** with custom **CardView** layouts. This project was developed as part of an Android development assignment to showcase proficiency in UI/UX design and data handling in Java.

## 🚀 Features

- **Dynamic RecyclerView**: Smooth scrolling list of premium food items.
- **Interactive UI**: Custom-designed `CardView` items with elevation and rounded corners.
- **Detail View Navigation**: Seamless transition from the list to a detailed product page using Intents.
- **Detailed Descriptions**: Each item includes specific descriptions and pricing.
- **Modern Material Design**: Uses Material 3 components and custom color palettes.
- **Ordering System**: Functional "Order Now" interaction with user feedback (Toast).

## 🛠 Tech Stack

- **Language**: Java
- **UI Framework**: XML (ConstraintLayout, LinearLayout, CardView)
- **Components**: 
  - `RecyclerView` for efficient list rendering.
  - `Adapter` & `ViewHolder` pattern.
  - `Intents` for data passing between activities.
- **Minimum SDK**: 24 (Android 7.0)
- **Target SDK**: 36 (Android 15)

## 📸 Screenshots

| Menu List | Item Details |
| :---: | :---: |
| ![Main Screen](app/src/main/res/drawable/burger.png) | ![Detail Screen](app/src/main/res/drawable/burger.png) |
*(Note: Replace with actual screenshots after running the app)*

## 📂 Project Structure

```text
com.ladla.foodapp
├── MainActivity.java      # Main entry point with RecyclerView setup
├── DetailActivity.java    # Detailed view for individual food items
├── FoodAdapter.java       # Custom adapter for handling food list
└── FoodItem.java          # Model class for food data
```

## ⚙️ Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/ladla-hamza-sial/Fast-Food-Hub.git
   ```
2. Open the project in **Android Studio**.
3. Build the project and run it on an emulator or physical device.

## 👤 Author

**Hamza Saqib**
- GitHub: [@ladla-hamza-sial](https://github.com/ladla-hamza-sial)

---
*Developed for Android Development Assignment.*
