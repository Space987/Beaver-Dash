import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class Level1 extends World
{
    public boolean gameStarted = false;
    GreenfootSound gameSound;
    public Level1()
    {
        super(925, 691, 1);
        prepare();
        showText("Press spacebar to start", 210, 100);
        gameSound = new GreenfootSound("GameplayMusic.wav");
    }
    
    
    public void started()
    {
        gameSound.playLoop();
    }
    
    public void stopped()
    {
        gameSound.stop();
    }

    public void act()
    {
        while(!gameStarted)
        {       
            if(Greenfoot.isKeyDown("space"))
            {
                gameStarted = true;
                showText(" ",210,100);
            }
        }
    }

    private void prepare()
    {
        Stone stone =  new  Stone();
        addObject(stone, 19, 30);
        stone.setLocation(17, 30);
        rock rock =  new  rock();
        addObject(rock, 61, 29);
        rock.setLocation(67, 29);
        Stone stone2 =  new  Stone();
        addObject(stone2, 117, 24);
        rock rock2 =  new  rock();
        addObject(rock2, 171, 22);
        rock2.setLocation(168, 22);
        Stone stone3 =  new  Stone();
        addObject(stone3, 220, 24);
        stone3.setLocation(214, 24);
        rock rock3 =  new  rock();
        addObject(rock3, 267, 24);
        Stone stone4 =  new  Stone();
        addObject(stone4, 315, 24);
        rock rock4 =  new  rock();
        addObject(rock4, 367, 23);
        rock rock5 =  new  rock();
        addObject(rock5, 421, 22);
        rock5.setLocation(421, 22);
        Stone stone5 =  new  Stone();
        addObject(stone5, 469, 20);
        rock rock6 =  new  rock();
        addObject(rock6, 522, 18);
        Stone stone6 =  new  Stone();
        addObject(stone6, 572, 20);
        stone6.setLocation(570, 15);
        Stone stone7 =  new  Stone();
        addObject(stone7, 615, 17);
        rock rock7 =  new  rock();
        addObject(rock7, 660, 17);
        rock rock8 =  new  rock();
        addObject(rock8, 710, 19);
        Stone stone8 =  new  Stone();
        addObject(stone8, 762, 19);
        rock rock9 =  new  rock();
        addObject(rock9, 812, 23);
        Stone stone9 =  new  Stone();
        addObject(stone9, 846, 46);
        Stone stone10 =  new  Stone();
        addObject(stone10, 874, 84);
        rock rock10 =  new  rock();
        addObject(rock10, 902, 121);
        Stone stone11 =  new  Stone();
        addObject(stone11, 897, 156);
        stone11.setLocation(902, 156);
        rock rock11 =  new  rock();
        addObject(rock11, 902, 200);
        Stone stone12 =  new  Stone();
        addObject(stone12, 881, 239);
        rock rock12 =  new  rock();
        addObject(rock12, 846, 268);
        Stone stone13 =  new  Stone();
        addObject(stone13, 798, 282);
        rock rock13 =  new  rock();
        addObject(rock13, 744, 290);
        Stone stone14 =  new  Stone();
        addObject(stone14, 692, 290);
        rock rock14 =  new  rock();
        addObject(rock14, 639, 289);
        Stone stone15 =  new  Stone();
        addObject(stone15, 587, 290);
        Stone stone16 =  new  Stone();
        addObject(stone16, 534, 288);
        rock rock15 =  new  rock();
        addObject(rock15, 19, 183);
        Stone stone17 =  new  Stone();
        addObject(stone17, 71, 180);
        Stone stone18 =  new  Stone();
        addObject(stone18, 118, 182);
        rock rock16 =  new  rock();
        addObject(rock16, 170, 181);
        rock rock17 =  new  rock();
        addObject(rock17, 226, 176);
        rock17.setLocation(226, 177);
        Stone stone19 =  new  Stone();
        addObject(stone19, 278, 168);
        rock rock18 =  new  rock();
        addObject(rock18, 332, 172);
        Stone stone20 =  new  Stone();
        addObject(stone20, 385, 168);
        rock rock19 =  new  rock();
        addObject(rock19, 440, 164);
        Stone stone21 =  new  Stone();
        addObject(stone21, 490, 167);
        rock rock20 =  new  rock();
        addObject(rock20, 541, 163);
        Stone stone22 =  new  Stone();
        addObject(stone22, 595, 155);
        Beaver beaver =  new  Beaver();
        addObject(beaver, 19, 103);
        stone16.setLocation(549, 284);
        rock rock21 =  new  rock();
        addObject(rock21, 495, 294);
        Stone stone23 =  new  Stone();
        addObject(stone23, 448, 302);
        rock rock22 =  new  rock();
        addObject(rock22, 402, 302);
        Stone stone24 =  new  Stone();
        addObject(stone24, 346, 309);
        rock rock23 =  new  rock();
        addObject(rock23, 290, 309);
        stone24.setLocation(358, 313);
        rock23.setLocation(314, 308);
        rock23.setLocation(320, 317);
        Stone stone25 =  new  Stone();
        addObject(stone25, 265, 325);
        rock rock24 =  new  rock();
        addObject(rock24, 218, 329);
        rock rock25 =  new  rock();
        addObject(rock25, 169, 335);
        Stone stone26 =  new  Stone();
        addObject(stone26, 139, 350);
        Stone stone27 =  new  Stone();
        addObject(stone27, 134, 387);
        Stone stone28 =  new  Stone();
        addObject(stone28, 149, 423);
        rock rock26 =  new  rock();
        addObject(rock26, 188, 448);
        Stone stone29 =  new  Stone();
        addObject(stone29, 225, 463);
        rock rock27 =  new  rock();
        addObject(rock27, 276, 470);
        Stone stone30 =  new  Stone();
        addObject(stone30, 320, 466);
        rock rock28 =  new  rock();
        addObject(rock28, 370, 467);
        Stone stone31 =  new  Stone();
        addObject(stone31, 416, 464);
        rock rock29 =  new  rock();
        addObject(rock29, 470, 465);
        Stone stone32 =  new  Stone();
        addObject(stone32, 519, 486);
        rock rock30 =  new  rock();
        addObject(rock30, 568, 492);
        Stone stone33 =  new  Stone();
        addObject(stone33, 624, 491);
        rock rock31 =  new  rock();
        addObject(rock31, 671, 472);
        stone33.setLocation(617, 480);
        rock30.setLocation(572, 475);
        stone32.setLocation(526, 469);
        Stone stone34 =  new  Stone();
        addObject(stone34, 718, 469);
        Stone stone35 =  new  Stone();
        addObject(stone35, 769, 474);
        stone35.setLocation(780, 475);
        rock rock32 =  new  rock();
        addObject(rock32, 817, 470);
        Stone stone36 =  new  Stone();
        addObject(stone36, 865, 468);
        rock rock33 =  new  rock();
        addObject(rock33, 909, 472);
        rock33.setLocation(910, 467);
        Stone stone37 =  new  Stone();
        addObject(stone37, 906, 678);
        rock rock34 =  new  rock();
        addObject(rock34, 856, 676);
        rock34.setLocation(855, 680);
        Stone stone38 =  new  Stone();
        addObject(stone38, 796, 680);
        stone38.setLocation(810, 670);
        Stone stone39 =  new  Stone();
        addObject(stone39, 763, 672);
        stone39.setLocation(758, 676);
        rock rock35 =  new  rock();
        addObject(rock35, 712, 685);
        rock35.setLocation(710, 666);
        Stone stone40 =  new  Stone();
        addObject(stone40, 664, 679);
        rock rock36 =  new  rock();
        addObject(rock36, 612, 672);
        rock36.setLocation(624, 673);
        Stone stone41 =  new  Stone();
        addObject(stone41, 3, 224);
        stone41.setLocation(-4, 227);
        Stone stone42 =  new  Stone();
        addObject(stone42, 33, 283);
        stone42.setLocation(-7, 258);
        stone42.setLocation(15, 267);
        stone42.setLocation(-1, 266);
        Stone stone43 =  new  Stone();
        addObject(stone43, 66, 319);
        stone43.setLocation(33, 326);
        stone43.setLocation(-4, 306);
        Stone stone44 =  new  Stone();
        addObject(stone44, 75, 405);
        stone44.setLocation(-1, 351);
        stone44.setLocation(38, 360);
        stone44.setLocation(2, 349);
        Stone stone45 =  new  Stone();
        addObject(stone45, 41, 418);
        stone45.setLocation(-13, 393);
        stone45.setLocation(0, 395);
        stone45.setLocation(4, 396);
        stone45.setLocation(-6, 397);
        Stone stone46 =  new  Stone();
        addObject(stone46, 27, 460);
        stone46.setLocation(-14, 443);
        stone46.setLocation(10, 436);
        stone46.setLocation(4, 436);
        rock rock37 =  new  rock();
        addObject(rock37, 34, 478);
        rock37.setLocation(-13, 478);
        rock37.setLocation(22, 476);
        rock37.setLocation(9, 481);
        Stone stone47 =  new  Stone();
        addObject(stone47, 18, 519);
        rock rock38 =  new  rock();
        addObject(rock38, 47, 555);
        Stone stone48 =  new  Stone();
        addObject(stone48, 68, 588);
        rock rock39 =  new  rock();
        addObject(rock39, 111, 609);
        rock rock40 =  new  rock();
        addObject(rock40, 147, 632);
        Stone stone49 =  new  Stone();
        addObject(stone49, 186, 643);
        Stone stone50 =  new  Stone();
        addObject(stone50, 228, 662);
        rock rock41 =  new  rock();
        addObject(rock41, 270, 674);
        rock41.setLocation(274, 666);
        rock rock42 =  new  rock();
        addObject(rock42, 317, 682);
        rock42.setLocation(313, 682);
        rock rock43 =  new  rock();
        addObject(rock43, 372, 688);
        rock43.setLocation(364, 687);
        Stone stone51 =  new  Stone();
        addObject(stone51, 411, 671);
        stone51.setLocation(412, 699);
        stone51.setLocation(419, 679);
        rock rock44 =  new  rock();
        addObject(rock44, 479, 682);
        rock44.setLocation(444, 697);
        rock44.setLocation(452, 680);
        rock44.setLocation(457, 681);
        rock44.setLocation(454, 677);
        rock rock45 =  new  rock();
        addObject(rock45, 507, 673);
        rock45.setLocation(509, 696);
        rock45.setLocation(508, 680);
        rock45.setLocation(505, 677);
        Stone stone52 =  new  Stone();
        addObject(stone52, 566, 679);
        stone52.setLocation(568, 683);
        stone52.setLocation(570, 685);
        stone52.setLocation(564, 680);
        stone52.setLocation(568, 675);

        Log log =  new  Log();
        addObject(log, 745, 149);
        removeObject(stone22);
        log.setLocation(714, 153);
        Log log2 =  new  Log();
        addObject(log2, 98, 241);
        Log log3 =  new  Log();
        addObject(log3, 477, 533);
        log.setLocation(733, 150);
        log2.setLocation(93, 233);
        log.setLocation(783, 155);
        log.setLocation(749, 146);
        log2.setLocation(101, 239);
        log3.setLocation(494, 546);
        log3.setLocation(487, 546);
        log3.setLocation(487, 546);

        log3.setLocation(487, 547);

        rock35.setLocation(712, 668);
        rock45.setLocation(518, 674);

        EndLevel1 endLevel1 = new EndLevel1();
        addObject(endLevel1,902,579);
        endLevel1.setLocation(915,569);
        removeObject(endLevel1);
        EndLevel1 endLevel12 = new EndLevel1();
        addObject(endLevel12,905,576);
        endLevel12.setLocation(924,575);
        removeObject(endLevel12);
        addObject(endLevel12,924,568);
        endLevel12.setLocation(920,571);
        EndLevel1 endLevel13 = new EndLevel1();
        addObject(endLevel13,920,571);
        stone37.setLocation(873,601);
        removeObject(stone37);
        Stone stone53 = new Stone();
        addObject(stone53,900,676);
        rock33.setLocation(908,455);
        removeObject(rock33);
        rock rock46 = new rock();
        addObject(rock46,903,468);
        rock17.setLocation(222,147);
        rock17.setLocation(236,159);
        rock16.setLocation(182,164);
        rock17.setLocation(232,177);
        rock16.setLocation(180,176);
        log2.setLocation(99,239);
        Level1Checker level1Checker = new Level1Checker();
        addObject(level1Checker,51,650);
        level1Checker.setLocation(27,625);
        Score score = new Score();
        addObject(score,916,53);
        removeObject(score);
        Score score2 = new Score();
        addObject(score2,746,71);
        removeObject(score2);

        Cherry cherry = new Cherry();
        addObject(cherry,833,133);
        GoldenCherry goldenCherry = new GoldenCherry();
        addObject(goldenCherry,483,504);
        cherry.setLocation(825,132);
        Score score3 = new Score();
        addObject(score3,721,84);
        Level1Checker level1Checker2 = new Level1Checker();
        addObject(level1Checker2,910,47);
        removeObject(level1Checker2);
        log3.setLocation(517,564);
        goldenCherry.setLocation(496,530);
        log3.setLocation(511,566);
        goldenCherry.setLocation(498,527);
        removeObject(log2);
        log3.setLocation(581,528);
        removeObject(log3);
        FakeLog fakeLog = new FakeLog();
        addObject(fakeLog,540,536);
        goldenCherry.setLocation(495,550);
        goldenCherry.setLocation(492,555);
        fakeLog.setLocation(542,524);
        removeObject(fakeLog);
        removeObject(goldenCherry);
        FakeLog fakeLog2 = new FakeLog();
        addObject(fakeLog2,543,525);
        GoldenCherry goldenCherry2 = new GoldenCherry();
        addObject(goldenCherry2,504,542);
        removeObject(stone43);
        removeObject(stone44);
        removeObject(stone45);
        removeObject(stone46);
        rock rock47 = new rock();
        addObject(rock47,0,300);
        rock rock48 = new rock();
        addObject(rock48,0,449);
        rock rock49 = new rock();
        addObject(rock49,0,415);
        rock rock50 = new rock();
        addObject(rock50,0,330);
        rock rock51 = new rock();
        addObject(rock51,2,368);
        removeObject(stone26);
        removeObject(stone27);
        removeObject(stone28);
        rock25.setLocation(154,343);
        rock rock52 = new rock();
        addObject(rock52,154,343);
        rock25.setLocation(143,347);
        removeObject(rock52);
        rock26.setLocation(170,431);
        Stone stone54 = new Stone();
        addObject(stone54,170,431);
        rock rock53 = new rock();
        addObject(rock53,139,406);
        rock26.setLocation(144,434);
        rock26.setLocation(194,461);
        stone54.setLocation(127,452);
        removeObject(stone54);
        removeObject(rock26);
        rock rock54 = new rock();
        addObject(rock54,188,448);
        Stone stone55 = new Stone();
        addObject(stone55,161,431);
        Stone stone56 = new Stone();
        addObject(stone56,148,375);
        rock53.setLocation(134,403);
        rock53.setLocation(130,403);
        removeObject(rock53);
        rock rock55 = new rock();
        addObject(rock55,143,401);
        Stone stone57 = new Stone();
        addObject(stone57,173,331);
        rock25.setLocation(151,366);
        removeObject(stone56);
        removeObject(rock25);
        stone57.setLocation(149,347);
        rock rock56 = new rock();
        addObject(rock56,149,347);
        removeObject(rock56);
        rock rock57 = new rock();
        addObject(rock57,179,339);
        rock rock58 = new rock();
        addObject(rock58,145,373);
        stone9.setLocation(846,60);
        stone9.setLocation(861,76);
        removeObject(stone10);
        removeObject(stone9);
        Stone stone58 = new Stone();
        addObject(stone58,852,51);
        rock rock59 = new rock();
        addObject(rock59,876,80);
        stone47.setLocation(40,517);
        stone47.setLocation(18,524);
        rock44.setLocation(468,690);
        removeObject(stone51);
        removeObject(rock45);
        removeObject(stone52);
        removeObject(rock36);
        rock rock60 = new rock();
        addObject(rock60,622,689);
        Stone stone59 = new Stone();
        addObject(stone59,573,688);
        rock rock61 = new rock();
        addObject(rock61,523,687);
        Stone stone60 = new Stone();
        addObject(stone60,414,688);
        removeObject(rock35);
        rock rock62 = new rock();
        addObject(rock62,708,689);
        removeObject(stone39);
        removeObject(stone38);
        Stone stone61 = new Stone();
        addObject(stone61,753,687);
        rock rock63 = new rock();
        addObject(rock63,804,682);
        stone16.setLocation(538,282);
        stone25.setLocation(283,316);
        removeObject(stone25);
        Stone stone62 = new Stone();
        addObject(stone62,272,320);
        stone18.setLocation(141,176);
        removeObject(stone18);
        Stone stone63 = new Stone();
        addObject(stone63,129,180);
        stone34.setLocation(735,481);
        removeObject(stone34);
        Stone stone64 = new Stone();
        addObject(stone64,725,477);
        removeObject(stone16);
        Stone stone65 = new Stone();
        addObject(stone65,538,297);
        removeObject(stone57);
        rock57.setLocation(169,352);
        rock rock64 = new rock();
        addObject(rock64,169,352);
        rock57.setLocation(186,331);
        goldenCherry2.setLocation(499,538);
        goldenCherry2.setLocation(499,525);
    }
}