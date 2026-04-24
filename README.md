# Craftable Nametag (Fabric)

Minecraft **1.20.1**, **Fabric Loader** ≥ **0.18.4**. Adds a **shaped** recipe for the vanilla name tag: one row, left to right — **iron ingot**, **leather**, **paper**.

**Fabric API:** This mod does **not** list Fabric API as a required dependency (the recipe is vanilla JSON in `data/`). You can run with **Loader + this mod only**. If you use **Fabric API** (e.g. for other mods), install a **current** build for 1.20.1, e.g. **0.92.0+1.20.1** or newer. Some older 1.20.1 Fabric API JARs crash in the crafting / recipe-remainder path with `NoSuchMethodError: getRecipeRemainder` (often seen when using leather); that comes from an outdated FAPI, not from this mod — see [Fabric #3935](https://github.com/FabricMC/fabric/issues/3935).

## Build

```bash
./gradlew build
```

JAR: `build/libs/`.

## Develop

```bash
./gradlew runClient
```

In survival or creative, use a crafting table: place the three items in a single **horizontal** row in that order (top row of the 3×3 grid).
