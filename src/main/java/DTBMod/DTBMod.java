package DTBMod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Properties;

import basemod.*;
import basemod.interfaces.EditCardsSubscriber;
import basemod.interfaces.EditCharactersSubscriber;
import basemod.interfaces.EditKeywordsSubscriber;
import basemod.interfaces.EditRelicsSubscriber;
import basemod.interfaces.EditStringsSubscriber;
import basemod.interfaces.OnCardUseSubscriber;
import basemod.interfaces.OnPowersModifiedSubscriber;
import basemod.interfaces.PostBattleSubscriber;
import basemod.interfaces.PostDrawSubscriber;
import basemod.interfaces.PostDungeonInitializeSubscriber;
import basemod.interfaces.PostExhaustSubscriber;
import basemod.interfaces.PostInitializeSubscriber;

import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.rooms.AbstractRoom;

@SpireInitializer
public class DTBMod implements 	EditCardsSubscriber,
								EditCharactersSubscriber,
								EditKeywordsSubscriber,
								EditRelicsSubscriber,
								EditStringsSubscriber,
								OnCardUseSubscriber,
								OnPowersModifiedSubscriber,
								PostBattleSubscriber,
								PostDrawSubscriber,
								PostDungeonInitializeSubscriber,
								PostExhaustSubscriber,
								PostInitializeSubscriber {
	public static final Logger logger = LogManager.getLogger(DTBMod.class.getName());
	
	public DTBMod() {
		BaseMod.subscribe(this);
	}

	@Override
	public void receivePostInitialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receivePostExhaust(AbstractCard arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receivePostDungeonInitialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receivePostDraw(AbstractCard arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receivePostBattle(AbstractRoom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receivePowersModified() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveCardUsed(AbstractCard arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveEditStrings() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveEditRelics() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveEditKeywords() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveEditCharacters() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveEditCards() {
		// TODO Auto-generated method stub
		
	}
}
