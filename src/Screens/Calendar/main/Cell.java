package Screens.Calendar.main;

import Actions.UserDBActions;
import static Helpers.SharedVariables.loggedUser;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Cell extends JButton {

    private Date date;
    private boolean title;
    private boolean isToDay;
    private boolean isBusy = false;
    private String[] tasks;

    public Cell() {
        setContentAreaFilled(false);
        setBorder(null);
        setHorizontalAlignment(JLabel.CENTER);
    }

    public void asTitle() {
        title = true;
    }

    public boolean isTitle() {
        return title;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public Date getDate(){
        return date;
    }
    
    public String[] getTasks(){
        return tasks;
    }

    public void currentMonth(boolean act) {
        if (act) {
            setForeground(new Color(68, 68, 68));
        } else {
            setForeground(new Color(169, 169, 169));
        }
    }

    public void setAsToDay() {
        isToDay = true;
        setForeground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        UserDBActions userDBActions = new UserDBActions();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        if (title) {
            grphcs.setColor(new Color(213, 213, 213));
            grphcs.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
        }
        if (!title){
            String dateString = dateFormat.format(date);
            tasks = userDBActions.getAllTasksByDeadLine(loggedUser, dateString);
//            System.out.println(loggedUser);
//            System.out.println(dateString);      
//            System.out.println(tasks.length);
            if (tasks.length != 0) isBusy = true;
        }
        if (isToDay) {
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(new Color(97, 49, 237));
            int x = getWidth() / 2 - 17;
            int y = getHeight() / 2 - 17;
            g2.fillRoundRect(x, y, 35, 35, 100, 100);
        }
        if (!title && isBusy) {
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(Color.RED);
            int dotSize = 10;
            int x = getWidth() - dotSize - 5;
            int y = (getHeight() - dotSize) / 2;
            g2.fillOval(x, y, dotSize, dotSize);
        }
        super.paintComponent(grphcs);
    }
    
    public void cellClickActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
        //date
    }  

}
