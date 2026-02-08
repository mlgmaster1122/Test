# Installing Decorative Sticks with Modrinth App

## Requirements
- **Minecraft version:** 1.21.10 (your Modrinth profile must use this exact version)
- **Fabric API** must be installed in the same profile (the mod will not load without it)

## Steps

### 1. Create or use a Fabric 1.21.10 profile
1. Open **Modrinth App**
2. Create a new profile (or use an existing one)
3. Set **Minecraft version** to **1.21.10**
4. Set **Mod loader** to **Fabric**
5. Create / save the profile

### 2. Add Fabric API (required)
1. Open your **1.21.10 Fabric** profile
2. Click **Add content** / **Get mods** (or similar)
3. Search for **Fabric API**
4. Install **Fabric API** for **1.21.10** (e.g. 0.137.0+1.21.10 or newer)
5. If the mod is already in the profile, make sure it’s enabled

### 3. Add Decorative Sticks
1. Build the mod (if you haven’t): in the project folder run  
   `.\gradlew.bat build`
2. Copy the mod JAR into the profile’s mods folder:
   - **From the project:** `build\libs\decorative-sticks-mod-1.0.0.jar`
   - **Do not use** the `-sources.jar` file
3. In Modrinth:
   - Either drag the JAR into the profile’s mod list, or
   - Open the profile’s **mods** folder (e.g. via “Open folder” or “Show in folder”) and paste the JAR there

### 4. Launch
1. Start the profile from Modrinth
2. In-game, check the **Building blocks** creative tab for the new stick blocks

## If it still doesn’t work

- **“Incompatible mod set” / mod won’t load**  
  Install **Fabric API** for 1.21.10 in this profile (see step 2).

- **Wrong Minecraft version**  
  This mod is for **1.21.10** only. If your profile is 1.21.4 or 1.21.1, create a new profile with **1.21.10** and Fabric, then add Fabric API and this mod there.

- **Crashes or errors**  
  Send the **latest log** from:
  - Modrinth: open the profile → **Open folder** (or similar) → look for `logs` and open the latest `.log` file.
  - Or from the Minecraft folder used by that profile: `logs/latest.log`

- **Blocks don’t appear**  
  Make sure you’re using `decorative-sticks-mod-1.0.0.jar` (not the `-sources` JAR) and that both Fabric API and Decorative Sticks are enabled in the profile.
