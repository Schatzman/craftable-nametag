# Craftable Nametag (Fabric)

Minecraft **1.20.1**, **Fabric Loader** ≥ **0.18.4**. Adds a **shaped** recipe for the vanilla name tag: one row, left to right — **iron ingot**, **leather**, **paper**.

**Fabric API (bundled):** Release **1.0.2+** embeds **Fabric API 0.92.8+1.20.1** (jar-in-jar under `META-INF/jars/`). You do **not** need a separate `fabric-api-*.jar` for this mod. If you still have an **old** Fabric API in `mods/` from before, **remove it** or upgrade it to **0.92.0+1.20.1** or newer — outdated FAPI builds are known to crash when the game touches crafting / recipe UI with items like leather or paper ([Fabric #3935](https://github.com/FabricMC/fabric/issues/3935), `getRecipeRemainder`).

## Build

```bash
./gradlew build
```

Use **`build/libs/craftable-nametag-1.0.2.jar`** (or current version from `gradle.properties`).

## Develop

```bash
./gradlew runClient
```

In survival or creative, use a crafting table: **top row** of the 3×3 grid — **iron ingot**, **leather**, **paper** (left to right) → **name tag**.
