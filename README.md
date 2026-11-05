# Roky Block (Bloque de Roky)

A Minecraft Fabric mod for Minecraft 1.21.11 that adds a new decorative block named "Bloque de Roky" along with a crafting ingredient block called the "Pencil Block". This mod lets you craft the special Roky Block using a bone and pencil blocks in a vertical arrangement, perfect for builders and collectors looking for unique decorative blocks.

## Install

1. Install Fabric Loader for Minecraft 1.21.11 from the official Fabric website.
2. Download Fabric API for Minecraft 1.21.11 and place it in your `mods` folder.
3. Download the `rokyblock-1.0.0.jar` file from this project's releases or build it yourself.
4. Place the mod jar file into your Minecraft `mods` folder.
5. Launch the game using the Fabric loader profile.

## Use

### Crafting the Roky Block

1. Open a crafting table.
2. Place items in the following 3×3 pattern (from top to bottom):
   - First row: Bone in the center
   - Second row: Pencil Block in the center
   - Third row: Pencil Block in the center
3. Collect your crafted Bloque de Roky.

### Finding Your Blocks

Both blocks are added to the "Building Blocks" creative inventory tab:
- **Bloque de Roky**: A decorative block with hardness 3.0 and blast resistance 6.0, requiring a tool to mine efficiently.
- **Pencil Block**: A decorative block with hardness 1.5 and blast resistance 6.0.

### Building from Source

If you want to build the mod yourself:

```bash
./gradlew build
```

The built jar file will be located at `build/libs/`.

### Texture Requirements

Before building, add these texture files:
- `src/main/resources/assets/rokyblock/textures/block/roky_block.png`
- `src/main/resources/assets/rokyblock/textures/block/pencil_block.png`

These are standard 16×16 PNG block textures. You can create custom textures or use placeholder images.

### Configuration

Mod properties are found in `gradle.properties`:
- Minecraft version: 1.21.11
- Yarn mappings: 1.21.11+build.1
- Fabric loader: 0.16.14
- Fabric API: 0.119.0+1.21.11
- Mod version: 1.0.0

The mod is licensed under the MIT License.

---

More Minecraft mod projects by EnderDevelopment: https://github.com/EnderDevelopment

Project page: https://dash.enderdevelopment.com/community/5499b84d-a48b-40a7-bda9-f6bd18d7a753?utm_source=github&utm_medium=readme&utm_campaign=auto_publish&utm_content=5499b84d-a48b-40a7-bda9-f6bd18d7a753
