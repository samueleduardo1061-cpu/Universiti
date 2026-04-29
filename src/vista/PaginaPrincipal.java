package vista;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import models.*;

public class PaginaPrincipal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName());
    
    Departamento departamento = new Departamento();
            
    Universidad universidad = new Universidad();
    ArrayList<Curso> cursos = new ArrayList<>();
    ArrayList<Estudiante> aspirantes = new ArrayList<>();

    public PaginaPrincipal() {
        initComponents();

        jLabel28.setText("Para saber información más detallada de un curso en especifico, \nescriba el nombre del curso y presione el ´bóton información detallada´");
        Estudiante estudiante0 = new Estudiante("Pepito", "Perez", "123");
        Estudiante estudiante1 = new Estudiante("Sandra", "Martinez", "555");
        Estudiante estudiante2 = new Estudiante("Ramirez", "Lisboa", "444");
        Estudiante estudiante3 = new Estudiante("Nacho", "Ah, gomensai", "666");
        
        area_aspirantes.append(estudiante0.getInformacion());
        area_aspirantes.append("\n ");
        area_aspirantes.append(estudiante1.getInformacion());
        area_aspirantes.append("\n ");
        area_aspirantes.append(estudiante2.getInformacion());
        area_aspirantes.append("\n ");
        area_aspirantes.append(estudiante3.getInformacion());
        area_aspirantes.append("\n ");

        aspirantes.add(estudiante0);
        aspirantes.add(estudiante1);
        aspirantes.add(estudiante2);
        aspirantes.add(estudiante3);
        
        //Creación de departamento

        Departamento arquitectura = new Departamento("Arquitectura");
        Departamento magia = new Departamento("Magia");
        Departamento software = new Departamento("Software");
        Departamento fisica = new Departamento("Física");

        universidad.agregarDepartamento(arquitectura);
        universidad.agregarDepartamento(magia);
        universidad.agregarDepartamento(software);
        universidad.agregarDepartamento(fisica);
        
        
        //Creación de profes
        Profesor profe0 = new Profesor("Pedro", "Picapiedra", "999", arquitectura);
        Profesor profe1 = new Profesor("Lucia", "Luz", "111", fisica);
        Profesor profe2 = new Profesor("Harry", "Potter", "000", magia);
        Profesor profe3= new Profesor("Maria", "Gpt", "888", software);
        
        
        //punto 2 Asignar profes a un departametno 
        departamento.agregarProfesor(profe0);
        departamento.agregarProfesor(profe1);
        departamento.agregarProfesor(profe2);
        departamento.agregarProfesor(profe3);
        
        //Creación de cursos
        Curso curso0 = new Curso("Billar", "El arte del Pool clásico", profe0);
        Curso curso1 = new Curso("Pscina", "El arte de nadar", profe1);
        Curso curso2 = new Curso("Derecho Romano", "El arte de manipular", profe2);
        Curso curso3 = new Curso("Aritmetica avanzada", "El arte de sumar", profe3);

        cursos.add(curso0);
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        
        for (Curso curso : cursos) {
            area_cursos_ofrecidos.append(curso.getNombrecurso());
            area_cursos_ofrecidos.append("\n ");
            
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areacursos = new javax.swing.JTextArea();
        jPanel10 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        area_aspirantes = new javax.swing.JTextArea();
        jPanel15 = new javax.swing.JPanel();
        txt_identificacion_estudiante = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_curso_matricular = new javax.swing.JTextField();
        btn_matricular_estudiante = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        area_cursos_ofrecidos = new javax.swing.JTextArea();
        btn_info_curso = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        area_informacion_curso = new javax.swing.JTextArea();
        jLabel28 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txt_nombre_curso_nuevo = new javax.swing.JTextField();
        txt_descripcion_curso_nuevo = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Universidad \"El buen pastor\".");

        jPanel9.setBackground(new java.awt.Color(204, 204, 255));

        areacursos.setColumns(20);
        areacursos.setRows(5);
        jScrollPane2.setViewportView(areacursos);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultar mis cursos inscritos"));

        jButton1.setText("Consultar");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jLabel19.setText("Estudiante:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField8)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 479, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(515, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Perfil estudiante", jPanel3);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aspirantes a la universidad del buen pasto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        area_aspirantes.setColumns(20);
        area_aspirantes.setRows(5);
        jScrollPane4.setViewportView(area_aspirantes);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Matricular a estudiante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        txt_identificacion_estudiante.addActionListener(this::txt_identificacion_estudianteActionPerformed);

        jLabel4.setText("Ingrese identificación del estudiante a matricular");

        jLabel5.setText("Curso a matricular:");

        btn_matricular_estudiante.setText("Matricular");
        btn_matricular_estudiante.addActionListener(this::btn_matricular_estudianteActionPerformed);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_matricular_estudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_identificacion_estudiante, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(txt_curso_matricular))))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_identificacion_estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txt_curso_matricular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btn_matricular_estudiante)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 433, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPane1.addTab("Matricular estudiantes", jPanel12);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cursos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        area_cursos_ofrecidos.setColumns(20);
        area_cursos_ofrecidos.setRows(5);
        area_cursos_ofrecidos.setBorder(null);
        jScrollPane5.setViewportView(area_cursos_ofrecidos);

        btn_info_curso.setText("Información detallada");
        btn_info_curso.addActionListener(this::btn_info_cursoActionPerformed);

        area_informacion_curso.setColumns(20);
        area_informacion_curso.setRows(5);
        jScrollPane6.setViewportView(area_informacion_curso);

        jLabel28.setText("Para saber información más detallada de un curso en especifico");

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Crear nuevo curso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel36.setText("Nombre");

        jLabel37.setText("Descripción");

        jLabel38.setText("Profesor");

        jButton7.setText("Crear curso");
        jButton7.addActionListener(this::jButton7ActionPerformed);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(90, 90, 90)
                        .addComponent(txt_nombre_curso_nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(txt_descripcion_curso_nuevo))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addGap(89, 89, 89)
                        .addComponent(jTextField10)))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(txt_nombre_curso_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(txt_descripcion_curso_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jButton7)
                .addContainerGap(412, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_info_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_info_curso)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane6)))))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Curso", jPanel16);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String profe = jTextField10.getText();

        Profesor seleccionado = null;
        for (Profesor p : departamento.getProfesores()) {
            if (p.getNombre().equalsIgnoreCase(profe)) {
                seleccionado = p;
                Curso curso = new Curso(txt_nombre_curso_nuevo.getText(), txt_descripcion_curso_nuevo.getText(), seleccionado);
                cursos.add(curso);
                JOptionPane.showMessageDialog(null, "Curso registrado con éxito.");
                System.out.println(cursos.toString());
                area_cursos_ofrecidos.append(curso.getNombrecurso());
                area_cursos_ofrecidos.repaint();

                break;
            } else {
                JOptionPane.showMessageDialog(null, "El docente no figura en el sistema.");
            }

        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void btn_info_cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_info_cursoActionPerformed
        // TODO add your handling code here:
        area_informacion_curso.setText("");
        String namecurso= jTextField1.getText();
        Curso selected = null;
        for (Curso curso : cursos) {
            if (curso.getNombrecurso().equalsIgnoreCase(namecurso)) {
                selected= curso;

                area_informacion_curso.append(curso.getInformacion());
            }

        }
    }//GEN-LAST:event_btn_info_cursoActionPerformed

    private void btn_matricular_estudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_matricular_estudianteActionPerformed

        System.out.println("Cursos disponibles:");
        for (Curso c : cursos) {
            System.out.println("'" + c.getNombrecurso() + "'");
        }

        String identificacion = txt_identificacion_estudiante.getText().trim();
        String nombreCurso = txt_curso_matricular.getText().trim();

        Estudiante estudianteEncontrado = null;
        for (Estudiante u : aspirantes) {
            if (u.getIdentificacion().equalsIgnoreCase(identificacion)) {
                estudianteEncontrado = u;
                break;
            }
        }

        Curso cursoEncontrado = null;
        for (Curso c : cursos) {
            if (c.getNombrecurso().equalsIgnoreCase(nombreCurso)) {
                cursoEncontrado = c;
                break;
            }
        }

        if (estudianteEncontrado == null) {
            JOptionPane.showMessageDialog(this, "Estudiante no encontrado.");
            return;
        }
        if (cursoEncontrado == null) {
            JOptionPane.showMessageDialog(this, "Curso no encontrado.");
            return;
        }

        estudianteEncontrado.agregarCurso(cursoEncontrado);
        universidad.agregarEstudiante(estudianteEncontrado);
        cursoEncontrado.inscribirEstudiante(estudianteEncontrado);
        JOptionPane.showMessageDialog(this, "Matrícula exitosa.");

    }//GEN-LAST:event_btn_matricular_estudianteActionPerformed

    private void txt_identificacion_estudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_identificacion_estudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_identificacion_estudianteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
 

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new PaginaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area_aspirantes;
    private javax.swing.JTextArea area_cursos_ofrecidos;
    private javax.swing.JTextArea area_informacion_curso;
    private javax.swing.JTextArea areacursos;
    private javax.swing.JButton btn_info_curso;
    private javax.swing.JButton btn_matricular_estudiante;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField txt_curso_matricular;
    private javax.swing.JTextField txt_descripcion_curso_nuevo;
    private javax.swing.JTextField txt_identificacion_estudiante;
    private javax.swing.JTextField txt_nombre_curso_nuevo;
    // End of variables declaration//GEN-END:variables
}
