package DTBMod;
import DTBMod.cards.RuI;

import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer;
import com.megacrit.cardcrawl.localization.CardStrings;
import com.megacrit.cardcrawl.unlock.UnlockTracker;

import basemod.BaseMod;
import basemod.interfaces.EditCardsSubscriber;
import basemod.interfaces.EditStringsSubscriber;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpireInitializer
public class DTBMod implements
	EditCardsSubscriber,
	EditStringsSubscriber
{
	public static final Logger logger = LogManager.getLogger(DTBMod.class.getName());
	private static String modID = "DTBMod";
	
	public DTBMod() {
		BaseMod.subscribe(this);
	}
	
	public static String getModID() {
		return modID;
	}
	
	public static String getImgPath(String imgName) {
		return getModID() + "/img/" + imgName;
	}
	
	public static String getLocPath(String lang, String fileName) {
		return getModID() + "/localization/" + lang + "/" + fileName;
	}
	
	public static void initialize() {
		logger.info("========================= DTBMod =========================");
		new DTBMod();
		logger.info("========================= DTBMod =========================");
	}
	
	@Override
	public void receiveEditStrings() {
		BaseMod.loadCustomStringsFile(CardStrings.class, getLocPath("zh-cn", "cards.json"));
	}

	@Override
	public void receiveEditCards() {
		BaseMod.addCard(new RuI());
		UnlockTracker.unlockCard(RuI.ID);
	}
}
