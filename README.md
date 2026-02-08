# Decorative Sticks Mod for Minecraft 1.21.10

A Fabric mod that adds 256 decorative stick and cross blocks in various orientations and colors.

**✅ NOW WITH FULL WINDOWS SUPPORT** - Includes `gradlew.bat`!

## Features

- **256 unique blocks** with different orientations, materials, and colors
- **8 stick orientations:**
  - Vertical Center, Left, Right, Middle
  - Horizontal Top, Middle, Bottom
  - Large Cross
- **16 colors:** All Minecraft dye colors
- **2 materials:** Concrete and Terracotta
- Directional placement (rotates based on player facing direction)
- Custom collision/hitboxes for each stick type

## Installation

### For Players:
1. Install [Fabric Loader](https://fabricmc.net/use/) for Minecraft 1.21.10
2. Install [Fabric API](https://www.curseforge.com/minecraft/mc-mods/fabric-api)
3. Download the mod JAR from releases
4. Place the JAR in your `.minecraft/mods` folder

### For Developers:
See **GETTING_STARTED.md** for full setup instructions.

## Building from Source

### Prerequisites
- Java 21 or higher
- IntelliJ IDEA with Minecraft Development plugin (recommended)

### Quick Start (Windows)
```cmd
gradlew build
```

### Quick Start (Mac/Linux)
```bash
./gradlew build
```

The compiled JAR will be in `build/libs/`

## Usage

All decorative sticks are in the **Building Blocks** creative tab.

**Crafting Recipe:**
```
[Colored Block]
[Colored Block]
```
Yields 8 decorative sticks.

## Documentation

- **GETTING_STARTED.md** - Complete setup guide
- **INTELLIJ_SETUP.md** - IntelliJ IDEA setup
- **CONVERSION_NOTES.md** - Technical Bedrock→Java details
- **QUICK_REFERENCE.md** - Commands and tips

## Credits

- Original Bedrock addon: "Decorational Sticks Addon"
- Converted to Fabric by automated scripts + manual implementation

## License

MIT License - See LICENSE file for details
