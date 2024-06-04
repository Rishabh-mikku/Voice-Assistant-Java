Voice Assistant Java Project

Overview
This project is a Virtual Assistant implemented in Java, designed to open websites in Google Chrome and control laptop operations such as opening C and D drives, and shutting down the laptop. The project is developed in the Eclipse IDE and utilizes the Sphinx library for speech recognition. All necessary JAR files are included in the repository.

Features
- Open websites in Google Chrome via voice commands.
- Access C and D drives through voice commands.
- Shut down the laptop using a voice command.

Prerequisites
Before you can run the project, ensure you have the following software installed:
- Java Development Kit (JDK) 8 or higher
- Eclipse IDE
- Google Chrome
- Sphinx-4 (included in the repository)

Setup Instructions

1. Clone the Repository
   ```sh
   git clone https://github.com/Rishabh-mikku/Voice-Assistant-Java.git
   cd virtual-assistant-java
   ```

2. Open the Project in Eclipse
   - Launch Eclipse IDE.
   - Select `File > Open Projects from File System`.
   - Click `Directory...` and select the cloned repository folder.
   - Click `Finish`.

3. Add JAR Files to Build Path
   - Right-click on the project in the Project Explorer.
   - Select `Build Path > Configure Build Path`.
   - Go to the `Libraries` tab and click `Add JARs...`.
   - Navigate to the `lib` folder in the project directory and select all the JAR files.
   - Click `OK`.

Usage

1. Run the Project
   - Right-click the `Main` class file in the Project Explorer.
   - Select `Run As > Java Application`.

2. Voice Commands
   - To open a website, say: "Open [website name]".
     Example: "Open Netflix" "Close Netflix"
   - To open C drive, say: "Open C drive".
   - To open D drive, say: "Open D drive".
   - To shut down the laptop, say: "Shut down".


Dependencies
The project uses the following libraries:
- Sphinx-4: Speech recognition library
- Java Native Access (JNA): For accessing system-level operations

Contribution
Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.

---

Thank you for using our Voice Assistant! We hope it makes your life easier and more productive.
