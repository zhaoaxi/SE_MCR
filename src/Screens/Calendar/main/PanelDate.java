package Screens.Calendar.main;

import java.awt.Component;
import java.util.Calendar;
import java.util.Date;

public class PanelDate extends javax.swing.JLayeredPane {

    private int month;
    private int year;
    private CalendarCustom cal;

    public PanelDate(int month, int year, CalendarCustom cal) {
        initComponents();
        this.month = month;
        this.year = year;
        this.cal = cal;
        init();
    }

    private void init() {
        mon.asTitle();
        tue.asTitle();
        wed.asTitle();
        thu.asTitle();
        fri.asTitle();
        sat.asTitle();
        sun.asTitle();
        setDate();
    }

    private void setDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);  //  month jan as 0 so start from 0
        calendar.set(Calendar.DATE, 1);
        int startDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;  //  get day of week -1 to index
        calendar.add(Calendar.DATE, -startDay);
        ToDay toDay = getToDay();
        for (Component com : getComponents()) {
            Cell cell = (Cell) com;
            if (!cell.isTitle()) {
                cell.setText(calendar.get(Calendar.DATE) + "");
                cell.setDate(calendar.getTime());
                cell.currentMonth(calendar.get(Calendar.MONTH) == month - 1);
                if (toDay.isToDay(new ToDay(calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR)))) {
                    cell.setAsToDay();
                }
                calendar.add(Calendar.DATE, 1); //  up 1 day
            }
        }
    }

    private ToDay getToDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        return new ToDay(calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR));
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sun = new Screens.Calendar.main.Cell();
        mon = new Screens.Calendar.main.Cell();
        tue = new Screens.Calendar.main.Cell();
        wed = new Screens.Calendar.main.Cell();
        thu = new Screens.Calendar.main.Cell();
        fri = new Screens.Calendar.main.Cell();
        sat = new Screens.Calendar.main.Cell();
        cell1 = new Screens.Calendar.main.Cell();
        cell9 = new Screens.Calendar.main.Cell();
        cell10 = new Screens.Calendar.main.Cell();
        cell11 = new Screens.Calendar.main.Cell();
        cell12 = new Screens.Calendar.main.Cell();
        cell13 = new Screens.Calendar.main.Cell();
        cell14 = new Screens.Calendar.main.Cell();
        cell15 = new Screens.Calendar.main.Cell();
        cell16 = new Screens.Calendar.main.Cell();
        cell17 = new Screens.Calendar.main.Cell();
        cell18 = new Screens.Calendar.main.Cell();
        cell19 = new Screens.Calendar.main.Cell();
        cell20 = new Screens.Calendar.main.Cell();
        cell21 = new Screens.Calendar.main.Cell();
        cell22 = new Screens.Calendar.main.Cell();
        cell23 = new Screens.Calendar.main.Cell();
        cell24 = new Screens.Calendar.main.Cell();
        cell25 = new Screens.Calendar.main.Cell();
        cell26 = new Screens.Calendar.main.Cell();
        cell27 = new Screens.Calendar.main.Cell();
        cell28 = new Screens.Calendar.main.Cell();
        cell29 = new Screens.Calendar.main.Cell();
        cell30 = new Screens.Calendar.main.Cell();
        cell31 = new Screens.Calendar.main.Cell();
        cell32 = new Screens.Calendar.main.Cell();
        cell33 = new Screens.Calendar.main.Cell();
        cell34 = new Screens.Calendar.main.Cell();
        cell35 = new Screens.Calendar.main.Cell();
        cell36 = new Screens.Calendar.main.Cell();
        cell37 = new Screens.Calendar.main.Cell();
        cell38 = new Screens.Calendar.main.Cell();
        cell39 = new Screens.Calendar.main.Cell();
        cell40 = new Screens.Calendar.main.Cell();
        cell41 = new Screens.Calendar.main.Cell();
        cell42 = new Screens.Calendar.main.Cell();
        cell43 = new Screens.Calendar.main.Cell();
        cell44 = new Screens.Calendar.main.Cell();
        cell45 = new Screens.Calendar.main.Cell();
        cell46 = new Screens.Calendar.main.Cell();
        cell47 = new Screens.Calendar.main.Cell();
        cell48 = new Screens.Calendar.main.Cell();
        cell49 = new Screens.Calendar.main.Cell();

        setLayout(new java.awt.GridLayout(7, 7));

        sun.setForeground(new java.awt.Color(255, 51, 51));
        sun.setText("Sun");
        sun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sunActionPerformed(evt);
            }
        });
        add(sun);

        mon.setText("Mon");
        add(mon);

        tue.setText("Tue");
        tue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tueActionPerformed(evt);
            }
        });
        add(tue);

        wed.setText("Wed");
        add(wed);

        thu.setText("Thu");
        thu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thuActionPerformed(evt);
            }
        });
        add(thu);

        fri.setText("Fri");
        add(fri);

        sat.setText("Sat");
        add(sat);

        cell1.setText("cell1");
        cell1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cell1FocusGained(evt);
            }
        });
        cell1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell1ActionPerformed(evt);
            }
        });
        add(cell1);

        cell9.setText("cell9");
        cell9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell9ActionPerformed(evt);
            }
        });
        add(cell9);

        cell10.setText("cell10");
        cell10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell10ActionPerformed(evt);
            }
        });
        add(cell10);

        cell11.setText("cell11");
        cell11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell11ActionPerformed(evt);
            }
        });
        add(cell11);

        cell12.setText("cell12");
        cell12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell12ActionPerformed(evt);
            }
        });
        add(cell12);

        cell13.setText("cell13");
        cell13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell13ActionPerformed(evt);
            }
        });
        add(cell13);

        cell14.setText("cell14");
        cell14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell14ActionPerformed(evt);
            }
        });
        add(cell14);

        cell15.setText("cell15");
        cell15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell15ActionPerformed(evt);
            }
        });
        add(cell15);

        cell16.setText("cell16");
        cell16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell16ActionPerformed(evt);
            }
        });
        add(cell16);

        cell17.setText("cell17");
        cell17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell17ActionPerformed(evt);
            }
        });
        add(cell17);

        cell18.setText("cell18");
        cell18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell18ActionPerformed(evt);
            }
        });
        add(cell18);

        cell19.setText("cell19");
        cell19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell19ActionPerformed(evt);
            }
        });
        add(cell19);

        cell20.setText("cell20");
        cell20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell20ActionPerformed(evt);
            }
        });
        add(cell20);

        cell21.setText("cell21");
        cell21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell21ActionPerformed(evt);
            }
        });
        add(cell21);

        cell22.setText("cell22");
        cell22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell22ActionPerformed(evt);
            }
        });
        add(cell22);

        cell23.setText("cell23");
        cell23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell23ActionPerformed(evt);
            }
        });
        add(cell23);

        cell24.setText("cell24");
        cell24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell24ActionPerformed(evt);
            }
        });
        add(cell24);

        cell25.setText("cell25");
        cell25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell25ActionPerformed(evt);
            }
        });
        add(cell25);

        cell26.setText("cell26");
        cell26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell26ActionPerformed(evt);
            }
        });
        add(cell26);

        cell27.setText("cell27");
        cell27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell27ActionPerformed(evt);
            }
        });
        add(cell27);

        cell28.setText("cell28");
        cell28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell28ActionPerformed(evt);
            }
        });
        add(cell28);

        cell29.setText("cell29");
        cell29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell29ActionPerformed(evt);
            }
        });
        add(cell29);

        cell30.setText("cell30");
        cell30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell30ActionPerformed(evt);
            }
        });
        add(cell30);

        cell31.setText("cell31");
        cell31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell31ActionPerformed(evt);
            }
        });
        add(cell31);

        cell32.setText("cell32");
        cell32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell32ActionPerformed(evt);
            }
        });
        add(cell32);

        cell33.setText("cell33");
        cell33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell33ActionPerformed(evt);
            }
        });
        add(cell33);

        cell34.setText("cell34");
        cell34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell34ActionPerformed(evt);
            }
        });
        add(cell34);

        cell35.setText("cell35");
        cell35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell35ActionPerformed(evt);
            }
        });
        add(cell35);

        cell36.setText("cell36");
        cell36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell36ActionPerformed(evt);
            }
        });
        add(cell36);

        cell37.setText("cell37");
        cell37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell37ActionPerformed(evt);
            }
        });
        add(cell37);

        cell38.setText("cell38");
        cell38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell38ActionPerformed(evt);
            }
        });
        add(cell38);

        cell39.setText("cell39");
        cell39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell39ActionPerformed(evt);
            }
        });
        add(cell39);

        cell40.setText("cell40");
        cell40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell40ActionPerformed(evt);
            }
        });
        add(cell40);

        cell41.setText("cell41");
        cell41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell41ActionPerformed(evt);
            }
        });
        add(cell41);

        cell42.setText("cell42");
        cell42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell42ActionPerformed(evt);
            }
        });
        add(cell42);

        cell43.setText("cell43");
        cell43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell43ActionPerformed(evt);
            }
        });
        add(cell43);

        cell44.setText("cell44");
        cell44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell44ActionPerformed(evt);
            }
        });
        add(cell44);

        cell45.setText("cell45");
        cell45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell45ActionPerformed(evt);
            }
        });
        add(cell45);

        cell46.setText("cell46");
        cell46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell46ActionPerformed(evt);
            }
        });
        add(cell46);

        cell47.setText("cell47");
        cell47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell47ActionPerformed(evt);
            }
        });
        add(cell47);

        cell48.setText("cell48");
        cell48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell48ActionPerformed(evt);
            }
        });
        add(cell48);

        cell49.setText("cell49");
        cell49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell49ActionPerformed(evt);
            }
        });
        add(cell49);
    }// </editor-fold>//GEN-END:initComponents

    private void sunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sunActionPerformed

    private void tueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tueActionPerformed

    private void thuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thuActionPerformed

    private void cell1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cell1FocusGained
        // TODO add your handling code here
    }//GEN-LAST:event_cell1FocusGained

    private void cell1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell1ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell1.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell1ActionPerformed

    private void cell9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell9ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell9.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell9ActionPerformed

    private void cell10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell10ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell10.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell10ActionPerformed

    private void cell11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell11ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell11.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell11ActionPerformed

    private void cell12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell12ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell12.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell12ActionPerformed

    private void cell13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell13ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell13.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell13ActionPerformed

    private void cell14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell14ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell14.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell14ActionPerformed

    private void cell15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell15ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell15.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell15ActionPerformed

    private void cell16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell16ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell16.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell16ActionPerformed

    private void cell17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell17ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell17.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell17ActionPerformed

    private void cell18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell18ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell18.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell18ActionPerformed

    private void cell19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell19ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell9.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell19ActionPerformed

    private void cell20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell20ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell20.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell20ActionPerformed

    private void cell21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell21ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell21.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell21ActionPerformed

    private void cell22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell22ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell22.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell22ActionPerformed

    private void cell23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell23ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell23.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell23ActionPerformed

    private void cell24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell24ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell24.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell24ActionPerformed

    private void cell25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell25ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell25.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell25ActionPerformed

    private void cell26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell26ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell26.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell26ActionPerformed

    private void cell27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell27ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell27.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell27ActionPerformed

    private void cell28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell28ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell28.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell28ActionPerformed

    private void cell29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell29ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell29.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell29ActionPerformed

    private void cell30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell30ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell30.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell30ActionPerformed

    private void cell31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell31ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell31.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell31ActionPerformed

    private void cell32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell32ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell32.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell32ActionPerformed

    private void cell33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell33ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell33.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell33ActionPerformed

    private void cell34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell34ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell34.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell34ActionPerformed

    private void cell35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell35ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell35.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell35ActionPerformed

    private void cell36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell36ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell36.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell36ActionPerformed

    private void cell37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell37ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell37.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell37ActionPerformed

    private void cell38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell38ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell38.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell38ActionPerformed

    private void cell39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell39ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell39.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell39ActionPerformed

    private void cell40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell40ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell40.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell40ActionPerformed

    private void cell41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell41ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell41.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell41ActionPerformed

    private void cell42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell42ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell42.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell42ActionPerformed

    private void cell43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell43ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell43.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell43ActionPerformed

    private void cell44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell44ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell44.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell44ActionPerformed

    private void cell45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell45ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell45.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell45ActionPerformed

    private void cell46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell46ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell46.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell46ActionPerformed

    private void cell47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell47ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell47.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell47ActionPerformed

    private void cell48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell48ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell48.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell48ActionPerformed

    private void cell49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell49ActionPerformed
        // TODO add your handling code here:
        String[] taskList = cell49.getTasks();
        cal.modifyJListContent(taskList);
    }//GEN-LAST:event_cell49ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Screens.Calendar.main.Cell cell1;
    private Screens.Calendar.main.Cell cell10;
    private Screens.Calendar.main.Cell cell11;
    private Screens.Calendar.main.Cell cell12;
    private Screens.Calendar.main.Cell cell13;
    private Screens.Calendar.main.Cell cell14;
    private Screens.Calendar.main.Cell cell15;
    private Screens.Calendar.main.Cell cell16;
    private Screens.Calendar.main.Cell cell17;
    private Screens.Calendar.main.Cell cell18;
    private Screens.Calendar.main.Cell cell19;
    private Screens.Calendar.main.Cell cell20;
    private Screens.Calendar.main.Cell cell21;
    private Screens.Calendar.main.Cell cell22;
    private Screens.Calendar.main.Cell cell23;
    private Screens.Calendar.main.Cell cell24;
    private Screens.Calendar.main.Cell cell25;
    private Screens.Calendar.main.Cell cell26;
    private Screens.Calendar.main.Cell cell27;
    private Screens.Calendar.main.Cell cell28;
    private Screens.Calendar.main.Cell cell29;
    private Screens.Calendar.main.Cell cell30;
    private Screens.Calendar.main.Cell cell31;
    private Screens.Calendar.main.Cell cell32;
    private Screens.Calendar.main.Cell cell33;
    private Screens.Calendar.main.Cell cell34;
    private Screens.Calendar.main.Cell cell35;
    private Screens.Calendar.main.Cell cell36;
    private Screens.Calendar.main.Cell cell37;
    private Screens.Calendar.main.Cell cell38;
    private Screens.Calendar.main.Cell cell39;
    private Screens.Calendar.main.Cell cell40;
    private Screens.Calendar.main.Cell cell41;
    private Screens.Calendar.main.Cell cell42;
    private Screens.Calendar.main.Cell cell43;
    private Screens.Calendar.main.Cell cell44;
    private Screens.Calendar.main.Cell cell45;
    private Screens.Calendar.main.Cell cell46;
    private Screens.Calendar.main.Cell cell47;
    private Screens.Calendar.main.Cell cell48;
    private Screens.Calendar.main.Cell cell49;
    private Screens.Calendar.main.Cell cell9;
    private Screens.Calendar.main.Cell fri;
    private Screens.Calendar.main.Cell mon;
    private Screens.Calendar.main.Cell sat;
    private Screens.Calendar.main.Cell sun;
    private Screens.Calendar.main.Cell thu;
    private Screens.Calendar.main.Cell tue;
    private Screens.Calendar.main.Cell wed;
    // End of variables declaration//GEN-END:variables
}
