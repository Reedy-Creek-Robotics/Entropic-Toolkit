# Entropic-Toolkit
The purpose of this toolkit is to provide the methods to determine the distance the robot is from the edge of a ~2 ft x 2 ft foam tile used in the FIRST FTC field matches. The tools can be expanded upon to identify other lines on the field.

Each year, FIRST FTC releases a game that is played on a 12 ft x 12 ft field made up of interlocking foram tiles. In the past, accurate navigation of the field has required complex and expensive odometry pods to track robot movement. We propose that this toolkit can replace odometry by identifying the tile edges on the field with inexpensive, downward facing web-cameras and combining the derived distance from a tile edge with infered tile coordinate to get precising position on the field. Identification of the tile edge is performed via an implemnetation of the Hough transform which will identify straight lines in an image.

## General overview
The Tile edge detector is a useful alternative to odometry that is easy to implement and can localize your position on the field. What is needed to implement Tile Edge Dection is a webcam looking down at the field. Through a mathematical formula called a Hough Transform and calibration for your bot the program will spit out how far away you are from the tile edge and in turn your position on the field.

This program is intended only to be used with the FIRST FTC robot controller. Using it elsewhere may have unforseen consequences.

## Image calibration and camera mounting
A requisite for the image processing to work is accurate calibration of the camera field of view and that field of view's relationship to the robot center. To accomplish this we recommend that a sturdy camera mount be fabricated and that it be mounted in such a way that bumping the camera mount does not shift camera. We used a gridded sewing mat placed within the field of view of the camera to generate reference points for the calibration. 

## Installation 
**EasyOpenCV needs to be installed for this to work.**
Please follow directions [here](https://github.com/OpenFTC/EasyOpenCV#installation-instructions-android-studio) to install EasyOpenCV.

## Background research
[Hough Transform Wiki](https://en.wikipedia.org/wiki/Hough_transform)
