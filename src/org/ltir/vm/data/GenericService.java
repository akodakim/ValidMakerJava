/*
 * Project: ValidMakerJava
 * Package: org.ltir.vm.data
 * File: GenericService.java
 * Brief: 
 * 
 * Organization: LTIR UQAM
 * Authors: Amine Rahj, Abdelhakim Akodadi
 * Created on Oct 26, 2015, 2:34:12 AM
 */
package org.ltir.vm.data;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.io.BufferedReader;
import java.io.IOException;
import static org.ltir.vm.data.XSerializable.deserialize;

public class GenericService extends XSerializable {
    @XStreamAsAttribute
    private String name;
    private String description;
    
    private TreeNode<Command> commands;

    public GenericService(String name, String description) {
        this.name = name;
        this.description = description;
        this.commands = new TreeNode<>();
        this.commands.setRoot(commands);
    }
    
    public static GenericService deserializeGenericService(BufferedReader br) throws IOException{
        return (GenericService) deserialize(br);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TreeNode<Command> getCommand(int index) {
        return commands.get(index);
    }

    public boolean addCommand(TreeNode<Command> node) {
        return commands.add(node);
    }
    
    
}
