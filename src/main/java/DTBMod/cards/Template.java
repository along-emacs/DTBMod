package DTBMod.cards;

import static DTBMod.DTBMod.getImgPath;
import static DTBMod.DTBMod.makeID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.core.CardCrawlGame;
import com.megacrit.cardcrawl.localization.CardStrings;
import com.megacrit.cardcrawl.monsters.AbstractMonster;

import basemod.abstracts.CustomCard;

public class Template extends CustomCard {
	private static final String[] CLSNAMES = Thread.currentThread().getStackTrace()[1].getClassName().split("\\.");
	private static final String   CLSNAME  = CLSNAMES[CLSNAMES.length - 1];
	
	private static final Logger   LOGGER   = LogManager.getLogger(CLSNAME);
	
	public  static final String   ID       = makeID(CLSNAME);
	
    private static final CardStrings INFO = CardCrawlGame.languagePack.getCardStrings(ID);
    private static final int         COST = 0;

	public Template() {
		super(
				ID, INFO.NAME, getImgPath(CLSNAME), COST, INFO.DESCRIPTION,
        		AbstractCard.CardType.SKILL, AbstractCard.CardColor.RED,
        		AbstractCard.CardRarity.BASIC, AbstractCard.CardTarget.SELF
				);
	}
	
	@Override
	public void use(AbstractPlayer arg0, AbstractMonster arg1) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void upgrade() {
        if (!this.upgraded) {
            this.upgradeName();
        }
	}
}
