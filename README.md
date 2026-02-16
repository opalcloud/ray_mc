## ray_mc Minecraft 模组

这是一个使用 Forge（以 1.20.1 为例）的示例模组工程，其中包含一把自定义的 **神剑**：

- 固定极高伤害（约 10000）
- 可装备在主手和副手
- 不可附魔
- 其他行为与普通剑一致

### 基本使用步骤

1. 安装 JDK 17（Forge 1.20.1 要求）。
2. 在本目录下执行：
   - `gradle genIntellijRuns` 或 `gradle genEclipseRuns`（根据你的 IDE）。
   - `gradle runClient` 启动客户端测试。
3. 将你自己的材质文件 `god_sword.png` 放到：
   - `src/main/resources/assets/ray_mc/textures/item/god_sword.png`

