package com.attendance;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.highgui.HighGui;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.videoio.VideoCapture;

public class FaceDetection {

    public static void main(String[] args) {

        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        CascadeClassifier faceDetector =
                new CascadeClassifier(
                "C:/Users/acer/Downloads/opencv/build/etc/haarcascades/haarcascade_frontalface_default.xml"
                );

        if(faceDetector.empty()) {

            System.out.println("XML File Not Loaded");

            return;
        }
        VideoCapture camera =
                new VideoCapture(0);

        if (!camera.isOpened()) {

            System.out.println(
                    "Camera not detected"
            );

            return;
        }

        Mat frame = new Mat();

        boolean attendanceMarked = false;

        while (true) {

            camera.read(frame);

            MatOfRect faceDetections =
                    new MatOfRect();

            faceDetector.detectMultiScale(
                    frame,
                    faceDetections
            );

            for (Rect rect :
                    faceDetections.toArray()) {

                Imgproc.rectangle(
                        frame,
                        new Point(rect.x, rect.y),
                        new Point(
                                rect.x + rect.width,
                                rect.y + rect.height
                        ),
                        new Scalar(0, 255, 0),
                        3
                );

                System.out.println(
                        "Face Detected"
                );

                if(!attendanceMarked) {

                    AutoAttendance.markAttendance(
                            "Harshal"
                    );

                    attendanceMarked = true;
                }
            }

            HighGui.imshow(
                    "AI Attendance System",
                    frame
            );

            if (HighGui.waitKey(30) == 27) {

                break;
            }
        }

        camera.release();
    }
}