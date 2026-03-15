# Static-analysis-tool-katalon
A Gradle-based static code analysis implementation for Katalon Studio using CodeNarc v3.4.0 and Java 17.

# Katalon Static Code Analysis Tool

This project provides a standalone static code analysis setup for Katalon Studio (KS) projects. It uses **CodeNarc v3.4.0** to scan Groovy-based Keywords and Scripts for code smells, logic errors, and formatting issues.

## 🚀 Features
* **Java 17 Support:** Optimized for modern Katalon environments.
* **Gradle 8.10:** Uses the latest stable wrapper for performance and Java 23 compatibility.
* **Pre-configured Ruleset:** Includes a stable `codenarc.ruleset` that avoids deprecated rule crashes.

## 📋 Prerequisites
* **Java 17:** (specifically Temurin-17).
* **Katalon Studio:** v10 or higher.

## 🛠️ Setup
1. Clone this repository into your Katalon project root.
2. Ensure your custom keywords are located in the `Keywords/` folder.
3. Set your Java environment:
   ```bash
   export JAVA_HOME=$(/usr/libexec/java_home -v 17)
