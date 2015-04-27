/*
* StickMan.fx
*
*/
package com.anro.animation;

import javafx.scene.CustomNode;
import javafx.scene.Node;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.Group;
import javafx.animation.Timeline;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;

/**
* @author mark anro silva
*/
public class StickMan extends CustomNode {

override public var translateX;
override public var translateY;
override public var rotate;
var headX = 0;
var bodySX = 0;
var bodyEX = 0;
var armULSX = 0;
var armULEX = 0;
var armLLSX = 0;
var armLLEX = 0;
var armURSX = 0;
var armUREX = 0;
var armLRSX = 0;
var armLREX = 0;
var legULSX = 0;
var legULEX = 0;
var legLLSX = 0;
var legLLEX = 0;
var legURSX = 0;
var legUREX = 0;
var legLRSX = 0;
var legLREX = 0;
var timeline = Timeline {
repeatCount: Timeline.INDEFINITE
keyFrames: [
KeyFrame {
time: 1s
values: [
headX => 0 tween Interpolator.EASEBOTH,
bodySX => 0 tween Interpolator.EASEBOTH,
bodyEX => 0 tween Interpolator.EASEBOTH,
armURSX => 0 tween Interpolator.EASEBOTH,
armUREX => -10 tween Interpolator.EASEBOTH,
armLRSX => -10 tween Interpolator.EASEBOTH,
armLREX => -22 tween Interpolator.EASEBOTH,
armULSX => 0 tween Interpolator.EASEBOTH,
armULEX => 10 tween Interpolator.EASEBOTH,
armLLSX => 10 tween Interpolator.EASEBOTH,
armLLEX => 22 tween Interpolator.EASEBOTH,
legURSX => 0 tween Interpolator.EASEBOTH,
legUREX => -13 tween Interpolator.EASEBOTH,
legLRSX => -13 tween Interpolator.EASEBOTH,
legLREX => -30 tween Interpolator.EASEBOTH,
legULSX => 0 tween Interpolator.EASEBOTH,
legULEX => 13 tween Interpolator.EASEBOTH,
legLLSX => 13 tween Interpolator.EASEBOTH,
legLLEX => 30 tween Interpolator.EASEBOTH,
]
}
]
}
override function create(): Node {
timeline.play();
Group {
content: [
Circle {
fill: Color.WHITE
stroke: Color.BLACK
translateY:7
strokeWidth: 5
centerX:bind 15+headX centerY: 15
radius: 8
},
//head
Line {
strokeWidth: 5
startX: bind 15+bodySX startY: 30
endX: bind 15+bodyEX endY: 57
},
//body
Line {
strokeWidth: 5
startX: bind 15+armURSX startY: 30
endX: bind 20+armUREX endY: 43
},
Line {
strokeWidth: 5
startX: bind 20+armLRSX startY: 43
endX: bind 30+armLREX endY: 57
},
Line {
strokeWidth: 5
startX: bind 15+armULSX startY: 30
endX: bind 10+armULEX endY: 43
},
Line {
strokeWidth: 5
startX: bind 10+armLLSX startY: 43
endX: bind 8+armLLEX endY: 57
},
//arms
Line {
strokeWidth: 5
startX: bind 15+legURSX startY: 57
endX: bind 23+legUREX endY: 75
},
Line {
strokeWidth: 5
startX: bind 23+legLRSX startY: 75
endX: bind 30+legLREX endY: 90
},
Line {
strokeWidth: 5
startX: bind 15+legULSX startY: 57
endX: bind 10+legULEX endY: 75
},
Line {
strokeWidth: 5
startX: bind 10+legLLSX startY: 75
endX: bind 0+legLLEX endY: 90
}
//legs
]
}
}
}


/*
* Main.fx
*
*/
package com.anro.animation;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.animation.Timeline;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.scene.paint.Color;

/**
* @author mark anro silva
*/

var smY = 205;
var smX = 25;
var rotation = 0;
var stick_man = StickMan { translateY: bind smY translateX: bind smX rotate: bind rotation };

Stage {
title: "Walking Stickman"
scene: Scene {
width: 300
height: 300
fill: Color.WHITE
content: [
stick_man
]
}
}
Timeline {
repeatCount: Timeline.INDEFINITE
keyFrames: [
KeyFrame {
time: 6s
values: [
rotation => 0 tween Interpolator.EASEBOTH,
]
},
KeyFrame {
time: 7s
values: [
smX => 243 tween Interpolator.EASEBOTH,
smY => 205 tween Interpolator.EASEBOTH,
rotation => -90 tween Interpolator.EASEBOTH,
]
},
KeyFrame {
time: 13s
values: [
rotation => -90 tween Interpolator.EASEBOTH,
]
},
KeyFrame {
time: 14s
values: [
smX => 243 tween Interpolator.EASEBOTH,
smY => -13 tween Interpolator.EASEBOTH,
rotation => -180 tween Interpolator.EASEBOTH,
]
},
KeyFrame {
time: 20s
values: [
rotation => -180 tween Interpolator.EASEBOTH,
]
},
KeyFrame {
time: 21s
values: [
smX => 25 tween Interpolator.EASEBOTH,
smY => -13 tween Interpolator.EASEBOTH,
rotation => -270 tween Interpolator.EASEBOTH,
]
},
KeyFrame {
time: 27s
values: [
rotation => -270 tween Interpolator.EASEBOTH,
]
},
KeyFrame {
time:28s
values: [
smX => 25 tween Interpolator.EASEBOTH,
smY => 205 tween Interpolator.EASEBOTH,
rotation => -360 tween Interpolator.EASEBOTH,
]
},
]
}.play() 