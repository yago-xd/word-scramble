# 📕 Word Scramble Game

A simple console-based Word Scramble Game written in Java. This project challenges players to unscramble a randomly shuffled word within a limited number of attempts, testing both vocabulary and quick thinking.

![Java](https://img.shields.io/badge/Language-Java-blue.svg)
![Beginner Project](https://img.shields.io/badge/Level-Beginner-brightgreen)
![Console Game](https://img.shields.io/badge/Type-Console--App-lightgrey)

---

## 🚀 Features

- Random word selection from a list
- Words are scrambled each time for uniqueness
- Five attempts to guess the word correctly
- Time tracking and scoring system
- Input validation and helpful feedback
- Clean console interface with delay-based display

---

## 🚀 Getting Started

### 📦 Requirements
- Java 8 or higher
- A terminal or command line interface

### 🛠️ How to Run

Download the jar file from the releases section
```bash
java -jar word-scramble.jar
```

> Make sure words.txt is included in the correct directory or bundled inside your JAR as a resource under /words.txt.

---

## 🎮 How to Play

1. The game loads a word from the `words.txt` file.
2. The word is scrambled and shown to the player.
3. The player has **5 chances** to type the correct unscrambled version.
4. The game displays your time taken, attempts used, and a final score.
5. If you fail to guess the word in five tries, the correct word is revealed.

---
## 📖 Concepts Covered
📁 File I/O with InputStream (for embedded resources)  
🤖 Collections and character manipulation  
➡️ ArrayList, List, and random selection  
🎮 Scoring system logic  
💤 Real-time interaction with delays

---
## 🔧 Tools Used
Java 17 (works with Java 8+)  
IntelliJ IDEA (recommended)  
Git + GitHub

---

## 📝 Customization
Edit words.txt to add your own word list.

Make sure there are no blank lines and no lines starting with # (they are skipped as comments).

---

## 🧠 Sample Output

```console
╔══════════════════════════════════════╗
║     🎉 Welcome to Word Scramble 🎉  ║
╠══════════════════════════════════════╣
║ A word will be randomly scrambled.   ║
║ Your task: Unscramble it in 5 tries. ║
║                                      ║
║ 💡 Tip: Think fast but stay sharp!   ║
╚══════════════════════════════════════╝
🟡 Game Starting...

🧠 Unscramble this word: rvlaet
👉 Your guess: e
❌ Incorrect! Keep trying. 🔁 Attempts left: 4
👉 Your guess: travel

🎉 Congrats! You unscrambled it correctly!

🎮 Game Over!
══════════════════════════════════
🏁 You solved it!

📊 Your Performance:
⏱️  Time Taken     : 11 seconds
🎯 Attempts Used   : 2
⭐ Final Score     : 176
══════════════════════════════════
🙏 Thanks for playing! See you soon!
```
