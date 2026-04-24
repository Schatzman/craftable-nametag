# Craftable Nametag (Minecraft 1.20.1)

Adds a **shaped** recipe for the vanilla **name tag**: one **top** row, left to right — **iron ingot**, **leather**, **paper** → 1 name tag.

## Option A: Data pack (recommended)

- **No** Fabric Loader, **no** Fabric API, **no** mod JAR. Put the pack in each world’s `saves/<WorldName>/datapacks/` (unzipped folder or `.zip` with the usual structure).
- **Canonical sources** (same `data/craftable_nametag/.../nametag_from_materials.json`, `pack_format` 15): [governance-nexus: `datapacks/craftable-nametag`](https://github.com/Schatzman/governance-nexus/tree/main/datapacks/craftable-nametag).

In-game, use a crafting table; the three ingredients fill the top row. `/datapack list` should show the pack when it is enabled.

## Option B: This mod (optional JAR)

Use this if you only install content through the **mods** folder. The mod ships the same recipe as the data pack, packaged as a Fabric mod.

- **Minecraft 1.20.1**, **Fabric Loader** ≥ **0.18.4** (see `fabric.mod.json` / `gradle.properties`).
- **JAR 1.0.2+** bundles [Fabric API](https://github.com/FabricMC/fabric) via **jar-in-jar** so you do not add a second Fabric API JAR in `mods/`. If you have recipe/crafting-UI issues, remove any duplicate `fabric-api-*.jar` from `mods/`.

Troubleshooting: some older Fabric API + crafting-table combinations hit [Fabric #3935](https://github.com/FabricMC/fabric/issues/3935) (`getRecipeRemainder`); the **data pack** path avoids that class of issue entirely.

### Build and dev

```bash
./gradlew build
./gradlew runClient
```

Output JAR: `build/libs/craftable-nametag-<version>.jar`.
