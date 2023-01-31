import greenfoot.*;

public class CreationInfo extends World
{
    GreenfootSound gameSound;
    public CreationInfo()
    { 
        super(990, 557, 1); 
        prepare();
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

    private void prepare()
    {
       
    
        Pictures pictures = new Pictures();
        addObject(pictures,127,123);
        removeObject(pictures);
        Inspiration inspiration = new Inspiration();
        addObject(inspiration,789,53);
        HardestGame hardestGame = new HardestGame();
        addObject(hardestGame,719,455);
        inspiration.setLocation(714,380);
        removeObject(inspiration);
        removeObject(hardestGame);
        References2 references2 = new References2();
        addObject(references2,156,223);
        References3 references3 = new References3();
        addObject(references3,340,416);
        removeObject(references3);
        removeObject(references2);
      
        
       
        References2 references22 = new References2();
        addObject(references22,237,253);
        References3 references32 = new References3();
        addObject(references32,262,444);
        references22.setLocation(167,205);
        references32.setLocation(183,336);
        references22.setLocation(189,204);
        removeObject(references22);
        removeObject(references32);
        References2 references23 = new References2();
        addObject(references23,145,204);
        References3 references33 = new References3();
        addObject(references33,383,202);
        removeObject(references23);
        removeObject(references33);

        References2 references24 = new References2();
        addObject(references24,157,265);
        References3 references34 = new References3();
        addObject(references34,406,266);

        Inspiration inspiration2 = new Inspiration();
        addObject(inspiration2,750,76);
        removeObject(inspiration2);

        Pictures pictures2 = new Pictures();
        addObject(pictures2,253,78);
        removeObject(pictures2);
        Pictures pictures3 = new Pictures();
        addObject(pictures3,260,78);
        Inspiration inspiration3 = new Inspiration();
        addObject(inspiration3,760,278);
        inspiration3.setLocation(780,280);

        Inspiration1 inspiration1 = new Inspiration1();
        addObject(inspiration1,772,74);
        inspiration1.setLocation(814,90);
        inspiration1.setLocation(750,91);
        inspiration1.setLocation(770,88);
        inspiration1.setLocation(794,91);
        inspiration1.setLocation(750,95);
        inspiration1.setLocation(773,95);
        removeObject(inspiration1);
        Inspiration1 inspiration12 = new Inspiration1();
        addObject(inspiration12,777,76);
        inspiration3.setLocation(732,366);
        inspiration12.setLocation(751,270);
        Music music = new Music();
        addObject(music,639,73);
        Music2 music2 = new Music2();
        addObject(music2,824,167);
        pictures3.setLocation(171,86);
        music.setLocation(572,436);
        references34.setLocation(658,139);
        references24.setLocation(431,84);
        references34.setLocation(605,152);
        inspiration3.setLocation(199,208);
        references24.setLocation(512,128);
        references34.setLocation(186,377);
        inspiration3.setLocation(537,383);
        references24.setLocation(533,73);
        references34.setLocation(736,80);
        references34.setLocation(472,246);
        inspiration12.setLocation(319,485);
        inspiration3.setLocation(711,363);
        music.setLocation(211,278);
        music2.setLocation(517,279);
        music.setLocation(238,123);
        pictures3.setLocation(223,280);
        pictures3.setLocation(167,356);
        music.setLocation(200,49);
        references24.setLocation(322,324);
        references34.setLocation(382,354);
        inspiration3.setLocation(701,359);
        references34.setLocation(544,44);
        pictures3.setLocation(140,292);
        references24.setLocation(792,236);
        inspiration3.setLocation(801,357);
        references34.setLocation(513,304);
        references24.setLocation(358,309);
        pictures3.setLocation(163,174);
        references24.setLocation(103,288);
        references34.setLocation(332,288);
        inspiration12.setLocation(712,213);
        inspiration3.setLocation(744,319);
        music2.setLocation(499,142);
        references24.setLocation(111,304);
        references34.setLocation(316,301);
        inspiration3.setLocation(755,316);
        inspiration12.setLocation(742,236);
        music2.setLocation(537,47);
        inspiration3.setLocation(736,336);
        inspiration12.setLocation(743,235);
        references24.setLocation(138,305);
        references34.setLocation(301,301);
        pictures3.setLocation(276,239);
        music.setLocation(353,91);
        music2.setLocation(518,132);
        music.setLocation(336,60);
        music2.setLocation(549,49);
        music.setLocation(296,56);
        music2.setLocation(443,77);
        pictures3.setLocation(524,230);
        inspiration12.setLocation(499,65);
        inspiration3.setLocation(287,37);
        references34.setLocation(903,441);
        references24.setLocation(655,350);
        references34.setLocation(828,416);
        references24.setLocation(657,450);
        pictures3.setLocation(340,249);
        pictures3.setLocation(716,277);
        pictures3.setLocation(725,285);
        references24.setLocation(644,378);
        inspiration3.setLocation(798,67);
        inspiration12.setLocation(811,140);
        music.setLocation(758,71);
        inspiration12.setLocation(227,78);
        inspiration3.setLocation(202,302);
        inspiration12.setLocation(172,64);
        inspiration3.setLocation(227,183);
        inspiration12.setLocation(266,72);
        music.setLocation(733,49);
        music2.setLocation(730,111);
        pictures3.setLocation(670,305);
        references24.setLocation(620,403);
        references34.setLocation(832,393);
        pictures3.setLocation(732,316);
        music2.setLocation(757,184);
        inspiration3.setLocation(247,210);
        inspiration12.setLocation(242,107);
        inspiration12.setLocation(236,129);
        inspiration3.setLocation(231,131);
        removeObject(inspiration12);
        removeObject(inspiration3);
        removeObject(pictures3);
        removeObject(references34);
        removeObject(references24);
        removeObject(music2);
        Music2 music22 = new Music2();
        addObject(music22,736,155);
        References2 references25 = new References2();
        addObject(references25,678,453);
        References3 references35 = new References3();
        addObject(references35,863,452);
        removeObject(references25);
        References2 references26 = new References2();
        addObject(references26,620,453);
        Inspiration inspiration4 = new Inspiration();
        addObject(inspiration4,259,307);
        Inspiration1 inspiration13 = new Inspiration1();
        addObject(inspiration13,263,103);
        References1 references1 = new References1();
        addObject(references1,741,298);
        references1.setLocation(831,331);
        references1.setLocation(830,303);
        removeObject(references1);
        References1 references12 = new References1();
        addObject(references12,744,295);
        references12.setLocation(812,314);
        references12.setLocation(804,325);
        removeObject(references12);
        References1 references13 = new References1();
        addObject(references13,742,308);
        inspiration13.setLocation(324,135);
        inspiration13.setLocation(320,121);
        removeObject(inspiration13);
        Inspiration1 inspiration14 = new Inspiration1();
        addObject(inspiration14,258,129);
       
        BackTutorial backTutorial = new BackTutorial();
        addObject(backTutorial,80,528);
    }
}
