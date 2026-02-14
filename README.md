# NoGrief (Paper / Spigot Plugin)

Prevents common mob griefing without breaking vanilla mechanics.

This plugin **does NOT use the `mobGriefing` gamerule**, so farms, villagers, and other mechanics continue to work normally.

---

## Features

Currently disables only:

- Creeper explosions destroying blocks  
  *(damage, knockback, sound, particles still happen)*
- Endermen picking up or placing blocks

Everything else in vanilla behaves normally.

---

## Why this plugin exists

The vanilla gamerule:

```
/gamerule mobGriefing false
```

breaks many gameplay systems:

- Villager farming
- Sheep grass eating
- Piglin bartering behavior
- Mob AI interactions
- Various redstone contraptions

This plugin targets only the destructive behaviors players actually dislike.

---

## Compatibility

- Paper 1.21.x
- Spigot 1.21.x
- Tested on 1.21.10 and 1.21.11

No NMS used → future patch versions are very likely compatible.

---

## Installation

1. Download the latest jar from Releases
2. Place it in your server `/plugins/` folder
3. Start or restart the server

You should see:

```
[NoGrief] NoGrief enabled.
```

---

## What exactly is changed

| Mob | Behavior | Result |
|----|------|----|
| Creeper | Explosion | Blocks protected |
| Enderman | Block pickup | Cancelled |
| Enderman | Block placement | Cancelled |

Everything else remains vanilla.

---

## Technical Details

The plugin listens to:

- `EntityExplodeEvent` → clears block damage list for creepers
- `EntityChangeBlockEvent` → cancels Enderman block changes

No performance impact — events only run when triggered.

---

## Building from source

Requires:

- Java 21
- Gradle

```
gradle build
```

Output jar:
```
build/libs/NoGrief.jar
```

---

## Future Plans (maybe)

- Per-world settings
- Config file

---

## Author

Armen Hovhannisyan
