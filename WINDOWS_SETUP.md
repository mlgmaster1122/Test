# Windows Setup Guide - Decorative Sticks Mod

## ✅ What's Included

This package NOW includes:
- ✅ **gradlew.bat** - Windows Gradle wrapper
- ✅ **gradlew** - Linux/Mac Gradle wrapper  
- ✅ All source code and resources
- ✅ Complete project structure for IntelliJ IDEA

## Prerequisites

1. **Java 21 JDK**
   - Download from: https://adoptium.net/temurin/releases/?version=21
   - Select: **Windows x64** and **.msi installer**
   - Install and make sure "Add to PATH" is checked

2. **IntelliJ IDEA**
   - Download from: https://www.jetbrains.com/idea/download/?section=windows
   - Community Edition is free and works great

3. **Minecraft Development Plugin**
   - Install from IntelliJ Marketplace or use the ZIP file provided

## Step-by-Step Setup

### 1. Extract the Project

- **Right-click** on `decorative-sticks-mod.zip`
- Select **"Extract All..."**
- Choose a location (e.g., `C:\Users\YourName\Documents\`)
- Click **Extract**

### 2. Install Minecraft Development Plugin

**Option A - From provided ZIP:**
1. Open IntelliJ IDEA
2. Go to `File` → `Settings` → `Plugins`
3. Click gear icon ⚙️ → `Install Plugin from Disk...`
4. Select `Minecraft_Development-2025_3-1_8_11.zip`
5. Click **OK** and restart IntelliJ

**Option B - From Marketplace:**
1. `File` → `Settings` → `Plugins` → `Marketplace`
2. Search "Minecraft Development"
3. Install and restart

### 3. Open the Project

1. Launch IntelliJ IDEA
2. Click **Open** on the welcome screen
3. Navigate to the extracted `decorative-sticks-mod` folder
4. Select the folder (should see `build.gradle` inside)
5. Click **OK**
6. When prompted, click **"Trust Project"**

### 4. Wait for Gradle Sync

- IntelliJ will automatically start downloading dependencies
- Watch the progress bar at the bottom
- **First time takes 5-15 minutes** (downloads Minecraft, Fabric, etc.)
- ☕ Grab a coffee while it works!

### 5. Verify Setup

After Gradle finishes, you should see:
- ✅ No red errors in Java files
- ✅ Project tree shows `src/main/java` and `src/main/resources`
- ✅ "Minecraft Client" in run configurations dropdown (top-right)

## Running the Mod

### Method 1: IntelliJ Run Configuration (Recommended)
1. Look at the **top-right corner** of IntelliJ
2. Click the dropdown menu (might say "Current File")
3. Select **"Minecraft Client"**
4. Click the green play button ▶️

### Method 2: Gradle Panel
1. `View` → `Tool Windows` → `Gradle`
2. Expand: `decorative-sticks-mod` → `Tasks` → `fabric`
3. Double-click **`runClient`**

### Method 3: Terminal/Command Prompt
Open IntelliJ terminal (`View` → `Tool Windows` → `Terminal`) and run:
```cmd
gradlew runClient
```

**First Launch:**
- Downloads Minecraft assets (~5-10 minutes)
- After that, launches in ~30 seconds

## Building the Mod

To create a JAR file for distribution:

```cmd
gradlew build
```

Find the mod at: `build\libs\decorative-sticks-1.0.0.jar`

## Troubleshooting

### "gradlew is not recognized"
Make sure you're in the project directory. In IntelliJ terminal:
```cmd
cd decorative-sticks-mod
gradlew tasks
```

### Gradle sync fails
1. Check Java 21 is installed: `java -version`
2. Try: `gradlew clean build --refresh-dependencies`
3. Restart IntelliJ

### "Cannot find symbol" errors
1. Right-click `build.gradle` → "Reload Gradle Project"
2. `File` → `Invalidate Caches` → `Invalidate and Restart`

### Mod doesn't load in-game
1. Check `logs\latest.log` for errors
2. Verify Fabric API is installed
3. Check Minecraft version is 1.21.10

## Windows-Specific Tips

### File Paths
- Use `\` in Windows paths: `C:\Users\Joseph B\Documents\`
- IntelliJ terminal accepts both `/` and `\`

### Running from CMD/PowerShell
Navigate to project folder first:
```cmd
cd "C:\path\to\decorative-sticks-mod"
gradlew build
```

### Permissions
If you get "Access Denied":
- Right-click IntelliJ → "Run as Administrator"
- Or move project to a folder you own (not Program Files)

## Next Steps

1. ✅ Run "Minecraft Client" and test the mod
2. ✅ Open creative mode, go to Building Blocks tab
3. ✅ Try placing different colored sticks
4. ✅ Test all 8 orientations

## Additional Resources

- **GETTING_STARTED.md** - General setup guide
- **INTELLIJ_SETUP.md** - Detailed IntelliJ features
- **QUICK_REFERENCE.md** - Common commands

## Need Help?

- Fabric Discord: https://discord.gg/v6v4pMv
- Fabric Wiki: https://fabricmc.net/wiki/

---

**Happy Modding! 🎮**

This package has been tested to work on Windows 10/11 with IntelliJ IDEA and Java 21.
