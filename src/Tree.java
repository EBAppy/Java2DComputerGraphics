import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;

public class Tree{

    public void drawTree(Graphics2D g2d){
        AffineTransform resetTransformation = g2d.getTransform();
        Path2D.Double  leaves = new Path2D.Double();
        Path2D.Double leavesShade = new Path2D.Double();
        Path2D.Double leavesSkirmish = new Path2D.Double();
        Path2D.Double stem = new Path2D.Double();
        Path2D.Double stemShadow = new Path2D.Double();

        //draw laaves
        leaves.moveTo(125, 499);
        leaves.curveTo(127, 578, 282, 569, 268, 485);
        leaves.curveTo(291, 503, 324, 492, 321, 455);
        leaves.curveTo(354, 495, 402, 467, 410, 435);
        leaves.curveTo(415, 449, 430, 453, 437, 428);
        leaves.curveTo(446, 470, 484, 472, 509, 437);
        leaves.curveTo(483, 473, 505, 488, 538, 481);
        leaves.curveTo(528, 570, 680, 570, 688, 483);
        leaves.curveTo(780, 487, 760, 383, 738, 367);
        leaves.curveTo(800, 290, 720, 234, 674, 260);
        leaves.curveTo(740, 152, 610, 73, 555, 141);
        leaves.curveTo(573, 92, 500, 71, 480, 110);
        leaves.curveTo(469, 3, 283, 25, 280, 130);
        leaves.curveTo(227, 72, 133, 131, 145, 205);
        leaves.curveTo(88, 192, 41, 255, 80, 320);
        leaves.curveTo(36, 318, 5, 385, 55, 421);
        leaves.curveTo(5, 454, 73, 530, 125, 499);

        //draw leaves shade
        leavesShade.moveTo(282, 329);
        leavesShade.curveTo(298, 390, 378, 368, 400, 313);
        leavesShade.curveTo(422, 340, 455, 348, 497, 325);
        leavesShade.curveTo(488, 345, 498, 373, 520, 374);
        leavesShade.curveTo(512, 465, 618, 454, 630, 371);
        leavesShade.curveTo(674, 371, 687, 343, 650, 295);
        leavesShade.curveTo(684, 239, 663, 211, 608, 218);
        leavesShade.curveTo(638, 125, 598, 83, 508, 111);
        leavesShade.curveTo(498, 60, 458, 52, 423, 74);
        leavesShade.curveTo(424, 4, 298, 3, 270, 92);
        leavesShade.curveTo(205, 73, 140, 98, 128, 160);
        leavesShade.curveTo(82, 155, 15, 212, 78, 275);
        leavesShade.curveTo(4, 275, 18, 398, 103, 390);
        leavesShade.curveTo(118, 550, 258, 393, 282, 329);

        //small leaves
        leavesSkirmish.moveTo(83, 334);
        leavesSkirmish.curveTo(32, 305, 48, 228, 123, 223);
        leavesSkirmish.curveTo(79, 260, 60, 288, 83, 334);

        leavesSkirmish.moveTo(243, 315);
        leavesSkirmish.curveTo(278, 388, 231, 448, 163, 408);
        leavesSkirmish.curveTo(220, 401, 248, 391, 243, 315);

        //stem coordinates
        stem.moveTo(201, 477);
        stem.curveTo(348, 567, 271, 794, 217, 806);
        stem.curveTo(225, 818, 258, 802, 250, 810);
        stem.curveTo(240, 820, 275, 804, 293, 811);
        stem.curveTo(314, 819, 339, 800, 342, 817);
        stem.curveTo(352, 832, 375, 823, 388, 826);
        stem.curveTo(399, 832, 383, 813, 384, 808);
        stem.curveTo(405, 818, 408, 817, 410, 812);
        stem.curveTo(370, 804, 351, 734, 375, 605);
        stem.curveTo(380, 563, 440, 528, 515, 440);
        stem.curveTo(515, 440, 495, 423, 495, 423);
        stem.curveTo(470, 448, 450, 483, 425, 506);
        stem.curveTo(425, 506, 435, 382, 435, 382);
        stem.curveTo(435, 382, 425, 378, 415, 378);
        stem.curveTo(400, 483, 408, 535, 362, 562);
        stem.curveTo(362, 562, 395, 410, 400, 382);
        stem.curveTo(400, 388, 385, 388, 378, 388);
        stem.curveTo(378, 388, 355, 533, 345, 545);
        stem.curveTo(330, 529, 325, 507, 327, 476);
        stem.curveTo(327, 476, 340, 420, 340, 420);
        stem.curveTo(340, 420, 325, 418, 320, 418);
        stem.curveTo(320, 418, 310, 451, 310, 465);
        stem.curveTo(306, 441, 308, 436, 307, 424);
        stem.curveTo(307, 424, 291, 416, 281, 416);
        stem.curveTo(281, 416, 300, 516, 300, 516);
        stem.curveTo(287, 496, 275, 445, 250, 432);
        stem.curveTo(250, 432, 236, 432, 236, 432);
        stem.curveTo(236, 432, 260, 485, 260, 485);
        stem.curveTo(260, 485, 220, 457, 220, 457);
        stem.curveTo(220, 457, 221, 477, 201, 477);
        stem.closePath();


        //stem shadow coordinates
        stemShadow.moveTo(235, 805);
        stemShadow.curveTo(235, 805, 265, 793, 265, 793);
        stemShadow.curveTo(245, 818, 267, 816, 302, 794);
        stemShadow.curveTo(321, 817, 325, 817, 325, 783);
        stemShadow.curveTo(355, 815, 362, 813, 352, 790);
        stemShadow.curveTo(363, 807, 363, 807, 375, 810);
        stemShadow.curveTo(300, 570, 395, 552, 480, 465);//
        stemShadow.curveTo(480, 465, 490, 431, 490, 431);
        stemShadow.curveTo(490, 431, 416, 516, 416, 516);
        stemShadow.curveTo(416, 516, 435, 373, 435, 373);
        stemShadow.curveTo(435, 373, 425, 373, 400, 373);
        stemShadow.curveTo(417, 433, 415, 540, 355, 573);
        stemShadow.curveTo(355, 573, 393, 389, 393, 389);
        stemShadow.curveTo(393, 389, 386, 391, 386, 391);
        stemShadow.curveTo(386, 391, 360, 503, 330, 507);
        stemShadow.curveTo(330, 507, 312, 476, 312, 476);
        stemShadow.curveTo(312, 476, 334, 420, 334, 420);
        stemShadow.curveTo(334, 420, 323, 421, 323, 421);
        stemShadow.curveTo(323, 421, 305, 466, 305, 466);
        stemShadow.curveTo(305, 466, 300, 420, 300, 420);
        stemShadow.curveTo(300, 420, 290, 417, 290, 417);
        stemShadow.curveTo(290, 417, 306, 526, 306, 526);
        stemShadow.curveTo(306, 526, 243, 434, 243, 434);
        stemShadow.curveTo(243, 434, 230, 431, 230, 431);
        stemShadow.curveTo(230, 431, 287, 512, 287, 512);
        stemShadow.curveTo(287, 512, 220, 414, 220, 414);
        stemShadow.curveTo(210, 414, 212, 477, 212, 477);
        stemShadow.curveTo(355, 582, 243, 805, 235, 805);

        //print stem
        g2d.setStroke(new BasicStroke(3f));
        g2d.translate(45, 40);
        g2d.setColor(Color.decode("#9A4C1C"));
        g2d.fill(stem);
        g2d.setColor(Color.BLACK);
        g2d.draw(stem);

        //print stem shadow
        g2d.setClip(stem);
        g2d.setColor(Color.decode("#BA652C"));
        g2d.translate(-1, -2);
        g2d.fill(stemShadow);
        g2d.setClip(null);
        //redraw the black outline of the tree stem
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(2.5f));
        g2d.draw(stem);
        g2d.setTransform(resetTransformation);



        //print leaves on the screen
        g2d.setColor(Color.decode("#358316"));
        g2d.fill(leaves);
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(3f));
        g2d.draw(leaves);

        //print shadows
        g2d.translate(40, 65);
        g2d.setColor(Color.decode("#6CAB43"));
        g2d.fill(leavesShade);
        g2d.setColor(Color.decode("#358316"));
        g2d.fill(leavesSkirmish);
        g2d.setTransform(resetTransformation);
    }

    //draw tree
    public void trees(Graphics2D g2d){
        AffineTransform resetTransformations = g2d.getTransform();
        //leaves
        g2d.scale(0.825, 0.825);
        g2d.translate(1380, -40);
        drawTree(g2d);
        g2d.setTransform(resetTransformations);
    }

    //draw the yellow Christmas trees
    public void drawChristmasTree(Graphics2D g2d, String mainColor, String shadowColor){
        AffineTransform resetTransformations = g2d.getTransform();
        Path2D.Double christmasTree = new Path2D.Double();
        Path2D.Double christmasTreeShadow = new Path2D.Double();


        christmasTree.moveTo(202, 28);
        christmasTree.curveTo(210, 63, 223, 89, 248, 118);//1
        christmasTree.curveTo(243, 120, 238, 121, 232, 118);//2
        christmasTree.curveTo(232, 113, 264, 157, 264, 157);//3 --1st straight
        christmasTree.curveTo(264, 157, 246, 146, 246, 146);//4
        christmasTree.curveTo(252, 163, 266, 177, 284, 192);//5
        christmasTree.curveTo(284, 192, 261, 185, 261, 185);//6
        christmasTree.curveTo(272, 204, 282, 219, 299, 233);//7
        christmasTree.curveTo(284, 230, 276, 226, 264, 218);//8
        christmasTree.curveTo(271, 234, 281, 243, 299, 253);//9
        christmasTree.curveTo(299, 253, 283, 254, 283, 254);//10
        christmasTree.curveTo(290, 264, 295, 270, 309, 279);//11
        christmasTree.curveTo(309, 279, 286, 280, 286, 280);//12
        christmasTree.curveTo(297, 294, 299, 305, 319, 315);//13
        christmasTree.curveTo(308, 319, 292, 319, 272, 312);//14
        christmasTree.curveTo(272,312, 310, 339, 310, 339);//15
        christmasTree.curveTo(293, 342, 273, 338, 257, 329);//16
        christmasTree.curveTo(257, 329, 265, 350, 265, 350);//17
        christmasTree.curveTo(249, 342, 234, 330, 225, 321);//18
        christmasTree.curveTo(225, 321, 231, 341, 231, 341);//19
        christmasTree.curveTo(217, 329, 213, 324, 205, 313);//20--end 1st half
        christmasTree.curveTo(200, 322, 192, 332, 182, 338);//21
        christmasTree.curveTo(182, 338, 185, 320, 185, 320);//22
        christmasTree.curveTo(174, 332, 161, 339, 143, 345);//23
        christmasTree.curveTo(143, 345, 151, 328, 151, 328);//24
        christmasTree.curveTo(135, 337, 105, 342, 88, 336);//25
        christmasTree.curveTo(88, 336, 134, 310, 134, 310);//26
        christmasTree.curveTo(116, 315, 98, 317, 83, 314);//27
        christmasTree.curveTo(101, 307, 109, 297, 116, 280);//28
        christmasTree.curveTo(116, 280, 93, 279, 93, 279);//29
        christmasTree.curveTo(93, 279, 119, 254, 119, 254);//30
        christmasTree.curveTo(119, 254, 103, 253, 103, 253);//31
        christmasTree.curveTo(120, 244, 130, 234, 139, 217);//31
        christmasTree.curveTo(128, 226, 118, 230, 104, 233);//32
        christmasTree.curveTo(123, 216, 131, 206, 142, 185);//33
        christmasTree.curveTo(142, 185, 119, 192, 119, 192);
        christmasTree.curveTo(138, 177, 146, 167, 157, 146);//35
        christmasTree.curveTo(157, 146, 138, 158, 138, 158);//36
        christmasTree.curveTo(138, 158, 170, 119, 170, 119);//37
        christmasTree.curveTo(164, 121, 159, 121, 154, 117);
        christmasTree.curveTo(178, 92, 190, 68, 202, 28);

        //shadow coordinates
        christmasTreeShadow.moveTo(191, 35);
        christmasTreeShadow.curveTo(191, 35, 224, 113, 224, 113);
        christmasTreeShadow.curveTo(224, 113, 210, 112, 210, 112);
        christmasTreeShadow.curveTo(210, 112, 234, 148, 234, 148);
        christmasTreeShadow.curveTo(234, 148, 207, 135, 207, 135);
        christmasTreeShadow.curveTo(207, 135, 244, 175, 244, 175);
        christmasTreeShadow.curveTo(244, 175, 214, 166, 214, 166);
        christmasTreeShadow.curveTo(214, 166, 256, 212, 256, 212);
        christmasTreeShadow.curveTo(256, 212, 226, 200, 226, 200);
        christmasTreeShadow.curveTo(226, 200, 234, 215, 234, 215);
        christmasTreeShadow.curveTo(234, 215, 209, 200, 209, 200);
        christmasTreeShadow.curveTo(209, 200, 262, 243, 262, 243);
        christmasTreeShadow.curveTo(262, 243, 219, 233, 219, 233);
        christmasTreeShadow.curveTo(219, 233, 261, 272, 261, 272);
        christmasTreeShadow.curveTo(261, 272, 217, 267, 217, 267);
        christmasTreeShadow.curveTo(217, 267, 277, 301, 277, 301);
        christmasTreeShadow.curveTo(277, 301, 232, 295, 232, 295);
        //christmasTreeShadow.curveTo(232, 295, 240, 312, 240, 312);
        christmasTreeShadow.curveTo(240, 312, 229, 313, 229, 313);
        christmasTreeShadow.curveTo(229, 313, 204, 300, 204, 300);
        christmasTreeShadow.curveTo(204, 300, 167, 327, 167, 327);
        christmasTreeShadow.curveTo(167, 327, 171, 307, 171, 307);
        christmasTreeShadow.curveTo(171, 307, 126, 345, 126, 345);
        christmasTreeShadow.curveTo(126, 345, 145, 282, 145, 282);
        christmasTreeShadow.curveTo(145, 282, 93, 319, 93, 319);
        christmasTreeShadow.curveTo(93, 319, 122, 269, 122, 269);
        christmasTreeShadow.curveTo(122, 269, 99, 269, 99, 269);
        christmasTreeShadow.curveTo(99, 269, 138, 217, 138, 217);
        christmasTreeShadow.curveTo(138, 217, 113, 232, 113, 232);
        christmasTreeShadow.curveTo(113, 232, 147, 184, 147, 184);
        christmasTreeShadow.curveTo(147, 184, 104, 209, 104, 209);
        christmasTreeShadow.curveTo(104, 209, 156, 165, 156, 165);
        christmasTreeShadow.curveTo(156, 165, 121, 171, 187, 96);
        christmasTreeShadow.curveTo(179, 98, 174, 96, 167, 94);
        christmasTreeShadow.curveTo(167, 94, 191, 35, 191, 35);

        christmasTreeShadow.closePath();


        //stem coordinates
        g2d.setColor(Color.decode("#5D1906"));
        g2d.fillRect(193, 300, 21, 76 );

        //tree
        g2d.setColor(Color.decode(mainColor));
        g2d.fill(christmasTree);


        //tree shadow
        g2d.setClip(christmasTree);
        g2d.setColor(Color.decode(shadowColor));
        g2d.translate(-1, 3);
        g2d.fill(christmasTreeShadow);
        g2d.setClip(null);
        g2d.setTransform(resetTransformations);

        //draw tree outline
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(1.5f));
        g2d.draw(christmasTree);
    }

    //draw squirrel hole on the tree
    public void squirrelHole(Graphics2D g2d){
        AffineTransform resetTransformations = g2d.getTransform();
        Path2D.Double brownCrescent = new Path2D.Double();
        Path2D.Double blackHole = new Path2D.Double();

        //small crescent points
        brownCrescent.moveTo(1448, 511);
        brownCrescent.curveTo(1430, 502, 1416, 589, 1453, 574);
        brownCrescent.curveTo(1426, 568, 1441, 526, 1448, 511);

        //black circle points
        blackHole.moveTo(1446, 507);
        blackHole.curveTo(1426, 511, 1422, 566, 1439, 576);
        blackHole.curveTo(1476, 596, 1480, 503, 1446, 507);

        //draw the hole
        //small brown shade outline
        g2d.scale(1.2, 1.15);
        g2d.translate(-250, -82);
        g2d.setColor(new Color(0, 0, 0, 80));
        g2d.fill(blackHole);
        g2d.setTransform(resetTransformations);
        g2d.translate(-8, -12);
        g2d.setColor(Color.BLACK);
        g2d.fill(blackHole);
        g2d.setColor(Color.decode("#483320"));
        g2d.translate(2, 0);
        g2d.fill(brownCrescent);

        g2d.setTransform(resetTransformations);
    }
}
