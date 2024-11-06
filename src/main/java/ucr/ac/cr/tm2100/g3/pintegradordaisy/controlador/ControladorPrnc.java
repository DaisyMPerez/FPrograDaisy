/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.pintegradordaisy.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.tm2100.g3.pintegradordaisy.vista.GuiInstr;
import ucr.ac.cr.tm2100.g3.pintegradordaisy.vista.GuiLab;
import ucr.ac.cr.tm2100.g3.pintegradordaisy.vista.GuiPrincipal;

/**
 *
 * @author ucr.ac.cr.tm2100G3
 */
public class ControladorPrnc implements ActionListener{
    
    private GuiPrincipal guiPrincipal;
    private GuiInstr guiInstr;
    private GuiLab guiLab;

    public ControladorPrnc() {
        guiPrincipal = new GuiPrincipal(this);
        guiInstr = new GuiInstr();
        guiLab = new GuiLab();
        guiInstr.escuchar(this);
        guiLab.escuchar(this);
        guiPrincipal.setVisible(true);

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()) {
        
            case "instrucciones":
                guiPrincipal.setVisible(false);
                guiInstr.setVisible(true);
                break;
            
            case "jugar":
                guiLab.setVisible(true);
                guiPrincipal.setVisible(false);
            break;
            
            case "salirInter":
                guiLab.setVisible(false);
                guiPrincipal.setVisible(true);
            break;

            case "salir":
                System.exit(0);
            break;
            
            case "salirInstr":
                guiInstr.setVisible(false);
                guiPrincipal.setVisible(true);
            break;
        
        }

    }
    
}
