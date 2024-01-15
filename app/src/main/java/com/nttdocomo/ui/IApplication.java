//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.nttdocomo.ui;

//import com.nttdocomo.util.ScheduleDate;

public abstract class IApplication {
    public static final int LAUNCHED_FROM_MENU = 0;
    public static final int LAUNCHED_AFTER_DOWNLOAD = 1;
    public static final int LAUNCHED_FROM_TIMER = 2;
    public static final int LAUNCHED_AS_CONCIERGE = 3;
    public static final int LAUNCHED_FROM_EXT = 4;
    public static final int LAUNCHED_FROM_BROWSER = 5;
    public static final int LAUNCHED_FROM_MAILER = 6;
    public static final int LAUNCHED_FROM_IAPPLI = 7;
    public static final int LAUNCHED_FROM_LAUNCHER = 8;
    public static final int LAUNCHED_AS_ILET = 9;
    public static final int LAUNCHED_MSG_RECEIVED = 10;
    public static final int LAUNCHED_MSG_SENT = 11;
    public static final int LAUNCHED_MSG_UNSENT = 12;
    public static final int LAUNCHED_FROM_LOCATION_INFO = 13;
    public static final int LAUNCHED_FROM_LOCATION_IMAGE = 14;
    public static final int LAUNCHED_FROM_PHONEBOOK = 15;
    public static final int LAUNCHED_FROM_DTV = 17;
    public static final int LAUNCHED_FROM_TORUCA = 18;
    public static final int LAUNCHED_FROM_FELICA_ADHOC = 19;
    public static final int LAUNCHED_FROM_MENU_FOR_DELETION = 20;
    public static final int LAUNCHED_FROM_BML = 21;
    public static final int LAUNCH_BROWSER = 1;
    public static final int LAUNCH_VERSIONUP = 2;
    public static final int LAUNCH_IAPPLI = 3;
    public static final int LAUNCH_AS_LAUNCHER = 4;
    public static final int LAUNCH_MAILMENU = 5;
    public static final int LAUNCH_SCHEDULER = 6;
    public static final int LAUNCH_MAIL_RECEIVED = 7;
    public static final int LAUNCH_MAIL_SENT = 8;
    public static final int LAUNCH_MAIL_UNSENT = 9;
    public static final int LAUNCH_MAIL_LAST_INCOMING = 10;
    public static final int LAUNCH_DTV = 12;
    public static final int LAUNCH_BROWSER_SUSPEND = 13;
    public static final int SUSPEND_BY_NATIVE = 1;
    public static final int SUSPEND_BY_IAPP = 2;
    public static final int SUSPEND_PACKETIN = 256;
    public static final int SUSPEND_CALL_OUT = 512;
    public static final int SUSPEND_CALL_IN = 1024;
    public static final int SUSPEND_MAIL_SEND = 2048;
    public static final int SUSPEND_MAIL_RECEIVE = 4096;
    public static final int SUSPEND_MESSAGE_RECEIVE = 8192;
    public static final int SUSPEND_SCHEDULE_NOTIFY = 16384;
    public static final int SUSPEND_MULTITASK_APPLICATION = 32768;

    public static final IApplication getCurrentApp() {
        return null;
    }

    public IApplication() {
    }

    public final String[] getArgs() {
        return null;
    }

    public final String getParameter(String var1) {
        return null;
    }

    public abstract void start();

    public void resume() {
    }

    public final void terminate() {
    }

    public final String getSourceURL() {
        return null;
    }

    public final int getLaunchType() {
        return 0;
    }

    public final void launch(int var1, String[] var2) {
    }

    public int getSuspendInfo() {
        return 0;
    }

//    public void setLaunchTime(int var1, ScheduleDate var2) {
//    }
//
//    public ScheduleDate getLaunchTime(int var1) {
//        return null;
//    }
//
//    public PushManager getPushManager() throws SecurityException {
//        return null;
//    }

    public final boolean isMoved() {
        return false;
    }

    public final void clearMoved() {
    }

    public final boolean isMovedFromOtherTerminal() {
        return false;
    }
}
