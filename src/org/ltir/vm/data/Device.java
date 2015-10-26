/*
 * Project: ValidMakerJava
 * Package: org.ltir.vm.data
 * File: Device.java
 * Brief: 
 * 
 * Organization: LTIR UQAM
 * Authors: Amine Rahj, Abdelhakim Akodadi
 * Created on Oct 26, 2015, 2:50:40 AM
 */
package org.ltir.vm.data;


public class Device {
    String name;
    String version;
    String model;
    String osVersion;
    CLIReference reference;
    TreeNode<Command> commands;
}
