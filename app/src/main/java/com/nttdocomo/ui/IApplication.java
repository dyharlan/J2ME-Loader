/*
 * @(#)IApplication.java	1.15 02/09/19
 *
 * Copyright 2001 NTT DoCoMo, Inc. All rights reserved.
 */

package com.nttdocomo.ui;

//import com.nttdocomo.lang.*;

import javax.microedition.midlet.MIDlet;

/**
 * This provides the template of an application.
 * Any application must be created inheriting this class.
 * <BR>The resume method is the method called right after an application returns from suspend status.  In case a current frame exists, a resume event is thrown to the frame and then the resume method is called.  Application programmers must be aware of this order when coding.
 * <P>When creating an application class by using this class, note the following.
 * <BR>Application programmers must not directly generate an instance of the IApplication's subclass.
 * <BR>When explicitly defining a constructor of a subclass of this class, designate "public" for the access identifier.  Also note that a constructor having parameters cannot be used to create an application object.  When the constructor is not defined, a default constructor will be generated.
 * <PRE>
 * Example 1: When not describing constructor explicitly
 *
 *  public MyApp extends IApplication {
 *    public void start() {
 *      ...
 *    }
 *  }
 *
 *
 * Example 2: When describing constructor explicitly
 *
 *   public MyApp2 extends IApplication {
 *      public MyApp2() {
 *        ...
 *      }
 *      public void start() {
 *      ...
 *      }
 *  }
 * </PRE>
 */

public abstract class IApplication extends MIDlet {

    /**
     * An application cannot directly generate an instance of this class.
     */
    public IApplication() {
    }

    /**
     * This obtains the launch parameter of an application.
     * This method can obtain the parameter designated by ADF.
     *
     * @return The alignment of character string of the launch parameter of an application.  When the parameter is not designated by ADF, the alignment of 0-length will be returned.
     */
//    public final String[] getArgs(){
//    }

    /**
     * This obtains the URL from which the application was downloaded.
     * For example, when the JAR-form file in which an application is stored is loaded as http://www.foo.com./download/prog/App1.jar, the return value is http://foo.com/download/prog.
     *
     * @return The character string indicating the URL from which an application was downloaded.
     */
    //public native String getSourceURL();

    /**
     * This obtains the object of the current application.
     *
     * @return The current application object.
     */
//    public static final IApplication getCurrentApp() {
//    }

    /**
     * Method to be called after the launch of application
     */
    public abstract void start();

    /**
     * Method to be called right after the application resumes from the suspended status.  When resume processing is necessary, this method is overridden by the class from which IApplication was inherited.
     */
    public void resume() { }

    /**
     * Only method to close the application.  When System.exit() is called in the scope of IApplication, SecurityException generated.
     */
    public final void terminate() {
    }
    //wrappers for iappli functions
    @Override
    public void destroyApp(boolean unconditional){
        terminate();
    }
    @Override
    public void pauseApp(){

    }
    @Override
    public void startApp(){
        start();
    }
}
