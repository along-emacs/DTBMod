package DTBMod;

import DTBMod.cards.RuI;
import DTBMod.cards.RuI_cost;

import com.badlogic.gdx.Gdx;
import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer;
import com.google.gson.Gson;
import com.megacrit.cardcrawl.localization.CardStrings;
import com.megacrit.cardcrawl.localization.Keyword;
import com.megacrit.cardcrawl.unlock.UnlockTracker;

import basemod.BaseMod;
import basemod.interfaces.EditCardsSubscriber;
import basemod.interfaces.EditKeywordsSubscriber;
import basemod.interfaces.EditStringsSubscriber;

import java.nio.charset.StandardCharsets;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpireInitializer
public class DTBMod implements
	EditCardsSubscriber,
	EditKeywordsSubscriber,
	EditStringsSubscriber
{
	private static final String[] CLSNAMES = Thread.currentThread().getStackTrace()[1].getClassName().split("\\.");
	private static final String   CLSNAME  = CLSNAMES[CLSNAMES.length - 1];
	
	public  static final String ID         = CLSNAME;
	
	private  static final Logger LOGGER    = LogManager.getLogger(ID);
	//private  static final Color  DTB_GRAY = CardHelper.getColor(64.0f, 70.0f, 70.0f);
	
	public DTBMod() {
		BaseMod.subscribe(this);
	}
	
	public static String getModID() {
		return ID;
	}
	
	public static String makeID(String Text) {
		return getModID() + ":" + Text;
	}
	
	public static String getImgPath(String imgName) {
		return getModID() + "/img/" + imgName + ".png";
	}
	
	public static String getLocPath(String lang, String fileName) {
		return getModID() + "/localization/" + lang + "/" + fileName;
	}
	
	public static void initialize() {
		new DTBMod();
	}
	
	@Override
	public void receiveEditStrings() {
		BaseMod.loadCustomStringsFile(CardStrings.class, getLocPath("zh-cn", "cards.json"));
	}
	
	@Override
	public void receiveEditCards() {
		BaseMod.addCard(new RuI());
		BaseMod.addCard(new RuI_cost());

		UnlockTracker.unlockCard(RuI.ID);
		UnlockTracker.unlockCard(RuI_cost.ID);
	}
	
	@Override
	public void receiveEditKeywords() {
		Gson gson = new Gson();
		String json = Gdx.files.internal(getLocPath("zh-cn", "keywords.json")).readString(String.valueOf(StandardCharsets.UTF_8));
		Keyword[] ks = gson.fromJson(json, Keyword[].class);
		if (ks != null) {
			for (Keyword ky : ks) {
				BaseMod.addKeyword(getModID().toLowerCase(), ky.NAMES, ky.DESCRIPTION);
			}
		}
	}
}
