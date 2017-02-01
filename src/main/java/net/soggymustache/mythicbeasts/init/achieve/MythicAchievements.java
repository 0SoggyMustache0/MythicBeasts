package net.soggymustache.mythicbeasts.init.achieve;

import net.minecraft.init.Items;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

public class MythicAchievements {
								//Add the new achievement as an achievement
	public static Achievement achievementUnseen, achievementShiny, achievementNew;
	
	
	public static void init(FMLInitializationEvent event)
	{
		achievementUnseen = new Achievement("achievement.Unseen", "Unseen", 0, 1, Items.ENDER_PEARL, (Achievement)null).registerStat();
		achievementShiny = new Achievement("achievement.Shiny", "Shiny", 1, -2, Items.GOLD_INGOT, (Achievement)null).registerStat();
		//REgister the achievement 			the 3 and -1 are the X and Y for the achievement in the achievement menu
		achievementNew = new Achievement("achievement.New", "New", 3, -1, Items.GOLD_INGOT, (Achievement)null).registerStat();

		//Addd your new achievement to this list
		AchievementPage.registerAchievementPage(new AchievementPage("MythicBeasts", new Achievement[]{achievementUnseen, achievementShiny, achivementNew}));
	}
}
