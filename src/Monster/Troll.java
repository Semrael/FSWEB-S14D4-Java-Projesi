package Monster;

import Monster.util.Constants;

public class Troll extends Monster implements Bleedable,Poisonable{
    @Override
    public double attact() {
        return getDamage()+bleed()+(getDamage()*poison());
    }

    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return getDamage()* Constants.BLEED_PERCENTAGE;
    }

    @Override
    public double bleed(int level) {
        return getDamage()*level*Constants.BLEED_PERCENTAGE;
    }


}
