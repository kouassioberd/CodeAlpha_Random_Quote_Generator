# CodeAlpha_Random_Quote_Generator

Random Quote Generator is a simple Android application built using **Kotlin** and **Jetpack Compose** that fetches and displays inspirational quotes from the **ZenQuotes API**.

----

## Table of Contents
1. [✨ Features](#✨-features)  
2. [🛠 Tech Stack](#🛠-tech-stack)
3. [🌐 API Used](#🌐-api-used)
4. [🏗 Architecture](#🏗-architecture)
5. [📂 Project Structure](#📂-project-structure)
6. [🚀 Getting Started](#🚀-getting-started)
7. [▶️ Run the App](#▶️-run-the-app)
8. [📸 Screenshots](#📸-screenshots)
9. [👨‍💻 Author](#👨‍💻-author)  
10. [📜 License](#📜-license)



---

## ✨ Features

✅ Fetches random quotes from ZenQuotes API
✅ Displays quote text and author  
✅ "New Quote" button to refresh content  
✅ Loading indicator while fetching data  
✅ Real-time network connectivity monitoring
✅ Offline state handling
✅ Internet connection alert dialog 
✅ Clean UI built with Jetpack Compose  
✅ MVVM Architecture  

---

## 🛠 Tech Stack

- Kotlin
- Jetpack Compose
- Retrofit
- Gson Converter
- Coroutines
- StateFlow / Flow
- MVVM Architecture 

---

## 🌐 API Used

### ZenQuotes API
Base URL:
```
https://zenquotes.io/

```
Endpoint:
```
GET /api/random

```

---

## 🏗 Architecture

The app follows the MVVM (Model-View-ViewModel) pattern:
- Model → QuoteDto
- Repository → QuoteRepository
- ViewModel → QuoteViewModel
- UI (Compose) → QuoteScreen
- Networking → RetrofitInstance, QuoteApi
- Connectivity → NetworkMonitor

---

## 📂 Project Structure
```
com.example.codealpha_random_quote_generator
├── data
│   ├── model
│   │   └── QuoteDto.kt
│   ├── remote
│   │   |── QuoteApi.kt
|   |   └── RetrofitInstance.kt
│   └── repository
│       └── QuoteRepository.kt
|
├── ui
│   └── screens
|       └── QuoteScreen.kt
│       
├── viewmodel
│   └── QuoteViewModel.kt
|── MainActivity.kt
└── NetworkMonitor.kt
    
```

---
## 🚀 Getting Started
### Prerequisites
- Android Studio (latest version recommended)
- Minimum SDK: (your SDK version)
- Internet connection

---

## ▶️ Run the App
1️⃣ Clone the repository:
```
git clone https://github.com/kouassioberd/CodeAlpha_Random_Quote_Generator.git

```
2️⃣ Open in Android Studio
3️⃣ Sync Gradle
4️⃣ Run the app on:  ▶️
  - Emulator
  - Physical Android device
  - 
---

## 📸 Screenshots
<img width="250" alt="Screenshot_20260212_153215" src="https://github.com/user-attachments/assets/10c1df5e-dfa4-437a-80ed-9c047fd5ad3f" />
<img width="250" alt="Screenshot_20260212_153433" src="https://github.com/user-attachments/assets/a3f7b547-741c-4af0-8f2a-0438537a4762" />
<img width="250" alt="Screenshot_20260212_153446" src="https://github.com/user-attachments/assets/51f8ba11-0a8b-4b4f-9399-b99254a583d4" />
<img width="250" alt="Screenshot_20260212_153457" src="https://github.com/user-attachments/assets/af3eaac3-e0e2-4289-b5ec-b9c3ac558fff" />
<img width="250" alt="Screenshot_20260212_153534" src="https://github.com/user-attachments/assets/0c67e4fa-39c6-48f1-8415-536090f2b91f" />
<img width="250" alt="Screenshot_20260212_153551" src="https://github.com/user-attachments/assets/6f4a362e-dea6-47f8-9f72-3df73d373e17" />
<img width="250" alt="Screenshot_20260212_153606" src="https://github.com/user-attachments/assets/b49b8906-708c-4538-9aba-e09b4269e2a9" />
<img width="250" alt="Screenshot_20260212_153618" src="https://github.com/user-attachments/assets/8643d889-c214-4a4c-8706-b1b6fce7953e" />
<img width="250" alt="Screenshot_20260212_153633" src="https://github.com/user-attachments/assets/47f57328-628a-443b-81e0-1ef4c5d6b68e" />
<img width="250" alt="Screenshot_20260212_153722" src="https://github.com/user-attachments/assets/59ab82e9-a445-4571-95fb-503555c0f33c" />
<img width="250" alt="Screenshot_20260212_153734" src="https://github.com/user-attachments/assets/a8ffd5a4-1bd9-4773-a69f-f6b94eda68a2" />
<img width="250" alt="Screenshot_20260212_153745" src="https://github.com/user-attachments/assets/88b338f9-2d23-43bd-a776-ae4a5276c9fa" />
<img width="250" alt="Screenshot_20260212_153854" src="https://github.com/user-attachments/assets/efe53f5d-c8a0-477b-927c-60b4ceb8684e" />
<img width="250" alt="Screenshot_20260212_153910" src="https://github.com/user-attachments/assets/4b3b6f17-5a57-4c0a-bb51-025633b4f1b3" />
<img width="250" alt="Screenshot_20260212_153931" src="https://github.com/user-attachments/assets/7f12cc78-cd0f-4424-8535-4e3dff9ab8d9" />
<img width="250" alt="Screenshot_20260212_153942" src="https://github.com/user-attachments/assets/2139203b-36a1-4f41-9dd2-6d852c50036d" />
<img width="250" alt="Screenshot_20260212_154001" src="https://github.com/user-attachments/assets/2791898f-2dd0-49fe-a908-32c9756ee7d8" />

---

## 👨‍💻 Author
Oberd KOUASSI – Software Engineer (Internship Ready)

---
## 📜 License
This project is for  internship purposes.










