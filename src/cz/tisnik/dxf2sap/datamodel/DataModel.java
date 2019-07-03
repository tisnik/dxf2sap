/**
 * 
 */
package cz.tisnik.dxf2sap.datamodel;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

/**
 * @author Pavel Tisnovsky
 *
 */
public class DataModel
{
    private DefaultMutableTreeNode root = new DefaultMutableTreeNode();
    private DefaultMutableTreeNode stats = new DefaultMutableTreeNode("Metadata");
    private DefaultMutableTreeNode layers = new DefaultMutableTreeNode("Layers");

    public DataModel()
    {
        this.root.add(this.stats);
        this.root.add(this.layers);
    }

    public TreeNode getTree()
    {
        return this.root;
    }

}
