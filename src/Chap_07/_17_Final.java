package Chap_07;

import Chap_07.Camera.ActionCam;
import Chap_07.Camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        // Final

        // public (final) class
        // public (final) void
        // public -> abstract > static >
        ActionCam actionCam = new ActionCam();
        //actionCam.lens = "표준렌즈";
        actionCam.recordVideo();
        actionCam.makeVideo();

        System.out.println("------------");

        SlowActionCam slowActionCam = new SlowActionCam();

        slowActionCam.makeVideo();

    }
}
