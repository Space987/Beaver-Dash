import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class Level3 extends World
{
    public boolean gameStarted = false;
    public Score score = new Score();

    public Level3()
    {
        super(860, 640, 1);
        prepare();
        showText("Press spacebar to start", 420, 310);

    }
    


    
    public void act()
    {
        while(!gameStarted)
        {       
            if(Greenfoot.isKeyDown("space"))
            {
                gameStarted = true;
                showText(" ",420,310);
            }
        }
    }

    private void prepare()
    {
        StoneLevel3 StoneLevel3 =  new  StoneLevel3();
        addObject(StoneLevel3, 23, 275);
        StoneLevel3 StoneLevel32 =  new  StoneLevel3();
        addObject(StoneLevel32, 25, 245);
        StoneLevel3 StoneLevel33 =  new  StoneLevel3();
        addObject(StoneLevel33, 30, 214);
        Rock_1 Rock_1 =  new  Rock_1();
        addObject(Rock_1, 254, 333);
        Rock_1 Rock_12 =  new  Rock_1();
        addObject(Rock_12, 253, 292);
        Rock_1 Rock_13 =  new  Rock_1();
        addObject(Rock_13, 261, 253);
        Rock_1 Rock_14 =  new  Rock_1();
        addObject(Rock_14, 436, 398);
        Rock_1 Rock_15 =  new  Rock_1();
        addObject(Rock_15, 420, 428);

        addObject(Rock_1, 498, 383);

        addObject(Rock_12, 542, 380);

        addObject(Rock_13, 691, 365);

        addObject(Rock_14, 744, 354);

        addObject(Rock_15, 857, 283);
        Rock_15.setLocation(860, 260);
        Rock_15.setLocation(850, 260);
        removeObject(Rock_15);
        addObject(Rock_15, 858, 258);
        Rock_1 Rock_16 =  new  Rock_1();
        addObject(Rock_16, 857, 175);
        Rock_1 Rock_17 =  new  Rock_1();
        addObject(Rock_17, 858, 74);
        Rock_1 Rock_18 =  new  Rock_1();
        addObject(Rock_18, 771, 453);
        Rock_1 Rock_19 =  new  Rock_1();
        addObject(Rock_19, 856, 375);
        Rock_1 Rock_110 =  new  Rock_1();
        addObject(Rock_110, 858, 487);

        addObject(Rock_16, 739, 637);

        addObject(Rock_17, 661, 635);

        addObject(Rock_19, 222, 630);
        addObject(Rock_110, 274, 568);
        Rock_1 Rock_111 =  new  Rock_1();
        addObject(Rock_111, 255, 504);
        Rock_1 Rock_112 =  new  Rock_1();
        addObject(Rock_112, 46, 491);
        Rock_1 Rock_113 =  new  Rock_1();
        addObject(Rock_113, 19, 449);
        Rock_1 Rock_114 =  new  Rock_1();
        addObject(Rock_114, 94, 464);
        Rock_1 Rock_115 =  new  Rock_1();
        addObject(Rock_115, 71, 423);
        Rock_1 Rock_116 =  new  Rock_1();
        addObject(Rock_116, 23, 386);
        Rock_1 Rock_117 =  new  Rock_1();
        addObject(Rock_117, 77, 121);
        Rock_1 Rock_118 =  new  Rock_1();
        addObject(Rock_118, 42, 165);
        Rock_1 Rock_119 =  new  Rock_1();
        addObject(Rock_119, 145, 45);
        Rock_1 Rock_120 =  new  Rock_1();
        addObject(Rock_120, 207, 6);
        Rock_1 Rock_121 =  new  Rock_1();
        addObject(Rock_121, 252, 2);

        addObject(Rock_111, 302, 10);

        addObject(Rock_112, 374, 14);

        addObject(Rock_113, 403, 33);

        addObject(Rock_114, 462, 63);

        addObject(Rock_115, 648, 36);

        addObject(Rock_116, 687, 36);

        addObject(Rock_117, 666, 59);

        addObject(Rock_118, 709, 10);

        addObject(Rock_119, 801, 4);

        addObject(Rock_120, 839, 15);

        addObject(Rock_121, 854, 31);

        Rock_1 Rock_125 =  new  Rock_1();
        addObject(Rock_125, 510, 227);
        Rock_1 Rock_126 =  new  Rock_1();
        addObject(Rock_126, 678, 217);
        Rock_1 Rock_127 =  new  Rock_1();
        addObject(Rock_127, 737, 189);
        Rock_1 Rock_128 =  new  Rock_1();
        addObject(Rock_128, 723, 228);
        Rock_1 Rock_129 =  new  Rock_1();
        addObject(Rock_129, 468, 456);
        Rock_1 Rock_130 =  new  Rock_1();
        addObject(Rock_130, 540, 453);

        Piranha Piranha =  new  Piranha();
        addObject(Piranha, 81, 265);
        Whirlpool Whirlpool =  new  Whirlpool();
        addObject(Whirlpool, 443, 166);

        Whirlpool.setLocation(440, 194);
        Whirlpool.setLocation(445, 214);
        Rock_1 Rock_131 =  new  Rock_1();
        addObject(Rock_131, 445, 214);
        Rock_1 Rock_132 =  new  Rock_1();
        addObject(Rock_132, 651, 194);
        Whirlpool Whirlpool2 =  new  Whirlpool();
        addObject(Whirlpool2, 639, 151);
        removeObject(Rock_132);
        Whirlpool2.setLocation(641, 200);
        addObject(Rock_132, 641, 200);
        Whirlpool2.setLocation(644, 183);

        Whirlpool.setLocation(447, 143);
        Whirlpool.setLocation(467, 190);
        Whirlpool.setLocation(451, 223);
        Whirlpool2.setLocation(651, 125);
        Whirlpool2.setLocation(654, 187);
        Whirlpool.setLocation(444, 177);
        Whirlpool.setLocation(454, 192);
        Whirlpool2.setLocation(666, 129);
        Whirlpool2.setLocation(648, 200);
        Whirlpool.setLocation(447, 214);
        Whirlpool.setLocation(487, 139);
        Rock_131.setLocation(455, 254);
        Whirlpool.setLocation(459, 147);
        Whirlpool2.setLocation(644, 114);
        Whirlpool2.setLocation(638, 181);
        Rock_132.setLocation(659, 201);
        Rock_131.setLocation(463, 220);
        Whirlpool.setLocation(456, 180);
        Rock_131.setLocation(453, 213);
        Whirlpool2.setLocation(648, 129);
        Rock_126.setLocation(637, 206);
        Whirlpool2.setLocation(654, 146);
        Whirlpool.setLocation(465, 167);
        Whirlpool.setLocation(440, 212);
        Rock_125.setLocation(470, 226);
        Rock_126.setLocation(596, 189);
        Whirlpool2.setLocation(644, 159);
        Whirlpool.setLocation(438, 164);
        Rock_125.setLocation(430, 214);
        Whirlpool.setLocation(484, 154);
        Whirlpool2.setLocation(650, 141);
        Whirlpool.setLocation(444, 167);
        Rock_125.setLocation(424, 194);
        Rock_125.setLocation(481, 220);
        Rock_125.setLocation(441, 215);

        Whirlpool.setLocation(399, 210);
        Rock_125.setLocation(428, 211);
        Rock_125.setLocation(498, 219);
        Whirlpool.setLocation(455, 223);
        Rock_125.setLocation(481, 131);
        Whirlpool.setLocation(465, 122);
        Whirlpool.setLocation(436, 218);
        Rock_125.setLocation(492, 209);
        Whirlpool.setLocation(462, 132);

        removeObject(Rock_117);
        StoneLevel3 StoneLevel34 =  new  StoneLevel3();
        addObject(StoneLevel34, 82, 134);

        addObject(Piranha, 134, 153);
        Piranha.setLocation(83, 273);
        Piranha.setLocation(165, 154);
        Piranha.setLocation(179, 166);
        Piranha.setLocation(182, 189);
        Rock_13.setLocation(271, 265);
        Rock_12.setLocation(277, 301);
        Rock_1.setLocation(268, 321);
        Rock_13.setLocation(274, 261);
        Rock_1.setLocation(254, 344);
        Rock_12.setLocation(268, 298);
        StoneLevel34.setLocation(66, 179);
        Rock_118.setLocation(90, 116);
        StoneLevel34.setLocation(79, 163);
        Rock_118.setLocation(89, 112);
        Rock_12.setLocation(264, 308);
        Rock_13.setLocation(270, 279);
        Rock_13.setLocation(272, 260);
        Rock_12.setLocation(265, 284);
        Rock_1.setLocation(269, 333);
        Rock_12.setLocation(255, 307);
        Rock_12.setLocation(267, 288);
        Rock_12.setLocation(261, 295);
        Rock_1 Rock_133 =  new  Rock_1();
        addObject(Rock_133, 261, 295);
        Rock_12.setLocation(268, 298);
        Rock_12.setLocation(267, 297);
        Rock_12.setLocation(256, 297);
        Rock_12.setLocation(267, 297);
        Rock_12.setLocation(275, 297);
        Rock_12.setLocation(273, 297);
        removeObject(Rock_133);
        Rock_12.setLocation(268, 295);

        Rock_1 Rock_122 =  new  Rock_1();
        addObject(Rock_122, 594, 241);
        Rock_1 Rock_123 =  new  Rock_1();
        addObject(Rock_123, 564, 241);
        Rock_1 Rock_124 =  new  Rock_1();
        addObject(Rock_124, 494, 262);

        addObject(Rock_125, 467, 246);

        addObject(Rock_126, 337, 231);
        Rock_128.setLocation(718, 229);

        addObject(Rock_127, 718, 229);
        Rock_127.setLocation(730, 188);

        addObject(Rock_128, 730, 188);
        Whirlpool.setLocation(463, 169);
        Whirlpool.setLocation(473, 134);
        Whirlpool.setLocation(461, 159);

        Rock_130.setLocation(515, 453);
        removeObject(Piranha);
        Piranha.setLocation(168, 264);

        Beaver beaver = new Beaver();
        addObject(beaver,28,576);
        Score score = new Score();
        addObject(score,186,159);
        Piranha piranha2 = new Piranha();
        addObject(piranha2,161,257);
        piranha2.setLocation(185,288);
        piranha2.setLocation(207,295);
        piranha2.setLocation(75,287);
        EndLevel3 endLevel3 = new EndLevel3();
        addObject(endLevel3,800,597);
        endLevel3.setLocation(847,628);
        endLevel3.setLocation(836,628);
        EndLevel3 endLevel32 = new EndLevel3();
        addObject(endLevel32,820,612);
        endLevel3.setLocation(840,622);
        endLevel3.setLocation(842,620);
        endLevel3.setLocation(849,620);
        endLevel3.setLocation(845,617);
        endLevel32.setLocation(748,552);
        endLevel32.setLocation(758,568);
        removeObject(endLevel32);
        removeObject(endLevel3);
        EndLevel3 endLevel33 = new EndLevel3();
        addObject(endLevel33,841,637);
        FakeLog2 fakeLog2 = new FakeLog2();
        addObject(fakeLog2,291,472);
        FakeLog2 fakeLog22 = new FakeLog2();
        addObject(fakeLog22,363,582);
        FakeLog2 fakeLog23 = new FakeLog2();
        addObject(fakeLog23,545,508);
        fakeLog2.setLocation(297,508);
        fakeLog2.setLocation(305,332);
        Cherry cherry = new Cherry();
        addObject(cherry,382,277);
        GoldenCherry goldenCherry = new GoldenCherry();
        addObject(goldenCherry,801,396);

        StoneLevel32.setLocation(80,319);
        StoneLevel32.setLocation(12,247);
        StoneLevel3.setLocation(24,292);
        StoneLevel32.setLocation(40,259);
        StoneLevel32.setLocation(21,250);
        Rock_12.setLocation(265,294);
        StoneLevel3 StoneLevel35 = new StoneLevel3();
        addObject(StoneLevel35,265,294);

        Stone stone = new Stone();
        addObject(stone,264,296);

        rock rock = new rock();
        addObject(rock,16,300);
        removeObject(piranha2);
        PiranhaLevel3 piranhaLevel3 = new PiranhaLevel3();
        addObject(piranhaLevel3,75,297);

        rock rock2 = new rock();
        addObject(rock2,19,247);

        removeObject(rock2);
        rockLevel3 rockLevel3 = new rockLevel3();
        addObject(rockLevel3,256,447);

        rockLevel3 rockLevel32 = new rockLevel3();
        addObject(rockLevel32,260,335);

        rockLevel3 rockLevel33 = new rockLevel3();
        addObject(rockLevel33,23,235);

        StoneLevel3 stoneLevel36 = new StoneLevel3();
        addObject(stoneLevel36,264,286);
        piranhaLevel3.setLocation(84,324);
        piranhaLevel3.setLocation(134,324);

        piranhaLevel3.setLocation(57,334);
        piranhaLevel3.setLocation(216,350);
        piranhaLevel3.setLocation(68,300);
        piranhaLevel3.setLocation(126,306);
        piranhaLevel3.setLocation(160,313);
        Rock_1 rock_134 = new Rock_1();
        addObject(rock_134,664,42);
        Rock_1 rock_135 = new Rock_1();
        addObject(rock_135,439,621);
        Rock_1 rock_136 = new Rock_1();
        addObject(rock_136,613,628);
        Rock_1 rock_137 = new Rock_1();
        addObject(rock_137,816,13);
        Rock_1 rock_138 = new Rock_1();
        addObject(rock_138,451,63);
        Rock_1 rock_139 = new Rock_1();
        addObject(rock_139,253,364);

        Rock_1 rock_140 = new Rock_1();
        addObject(rock_140,39,199);
        Rock_1 rock_141 = new Rock_1();
        addObject(rock_141,603,380);
        Rock_1 rock_142 = new Rock_1();
        addObject(rock_142,699,361);
        Rock_1 rock_143 = new Rock_1();
        addObject(rock_143,553,139);
        Rock_1 rock_144 = new Rock_1();
        addObject(rock_144,255,424);
        Rock_1 rock_145 = new Rock_1();
        addObject(rock_145,725,12);
        Rock_1 rock_146 = new Rock_1();
        addObject(rock_146,312,140);
        Rock_1 rock_147 = new Rock_1();
        addObject(rock_147,505,388);
        Rock_1 rock_148 = new Rock_1();
        addObject(rock_148,296,584);
        Rock_1 rock_149 = new Rock_1();
        addObject(rock_149,546,628);
        Rock_1 rock_150 = new Rock_1();
        addObject(rock_150,750,357);
    }
}

