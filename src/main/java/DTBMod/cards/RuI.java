package DTBMod.cards;

import DTBMod.DTBMod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.core.CardCrawlGame;
import com.megacrit.cardcrawl.localization.CardStrings;
import com.megacrit.cardcrawl.monsters.AbstractMonster;

import basemod.abstracts.CustomCard;

public class RuI extends CustomCard {
	public  static final Logger     logger  = LogManager.getLogger(RuI.class.getName());
    public  static final String     ID      = "DTBMod:RuI";
    private static CardStrings      cardStr = CardCrawlGame.languagePack.getCardStrings(ID);

    public  static final String     NAME   = cardStr.NAME;
    public  static final String     IMG    = DTBMod.getImgPath("RuI.png");
    private static final int        COST   = 2;
    public  static final String     DESC   = cardStr.DESCRIPTION;
    public  static final CardType   TYPE   = AbstractCard.CardType.SKILL;
    public  static final CardColor  COLOR  = AbstractCard.CardColor.RED;
    public  static final CardRarity RARITY = AbstractCard.CardRarity.BASIC;
    public  static final CardTarget TARGET = AbstractCard.CardTarget.SELF;

    public RuI() {
        super(ID, NAME, IMG, COST, DESC, TYPE, COLOR, RARITY, TARGET);
    }

    @Override
    public void use(AbstractPlayer p, AbstractMonster m) {
    	logger.info("DTBMod:RuI was used.");
    }

    @Override
    public AbstractCard makeCopy() {
        logger.info("DTBMod:RuI was copyed.");
        return new RuI();
    }

    @Override
    public void upgrade() {
        if (!this.upgraded) {
            this.upgradeName();
            logger.info("DTBMod:RuI was upgraded.");
        }
    }
}
