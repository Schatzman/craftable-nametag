# Craftable Nametag (Fabric) — **secondary** to the GN data pack

**Canonical source of the recipe (preferred):** the **Minecraft 1.20.1 data pack** in the governance-nexus repository:

- [`../datapacks/craftable-nametag/`](../datapacks/craftable-nametag/) (same `data/craftable_nametag/recipes/nametag_from_materials.json`, `pack_format` 15)

Use that folder or a zip of it in each world’s `saves/.../datapacks/`. It needs **no** Fabric API and avoids FAPI-related crafting crashes ([Fabric #3935](https://github.com/FabricMC/fabric/issues/3935)).

This **Gradle project** is optional: it only packages the same JSON as a JAR for players who only install through the Curse “Mods” tab. When building from here, 1.0.2+ **embeds** Fabric API (jar-in-jar). If you use the data pack, you do **not** need this mod.

---

# Original Fabric mod README (build / dev)

Minecraft **1.20.1**, **Fabric Loader** ≥ **0.18.4**. Adds a **shaped** recipe for the vanilla name tag: one row, left to right — **iron ingot**, **leather**, **paper**.

**Fabric API (bundled in JARs 1.0.2+):** `META-INF/jars/fabric-api-0.92.8+1.20.1.jar`. Remove duplicate old `fabric-api-*.jar` in `mods/` if you get recipe-UI crashes.

## Build

```bash
./gradlew build
```

## Develop

```bash
./gradlew runClient
```

**Top row** of 3×3 grid: **iron ingot** | **leather** | **paper** → **name tag**.
