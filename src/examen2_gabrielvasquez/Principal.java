package examen2_gabrielvasquez;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);

        AU.cargarArchivo();

        DefaultTableModel model = (DefaultTableModel) table_otherChannels.getModel();
        DefaultTableModel modelo = (DefaultTableModel) table_mysongs.getModel();

        for (Usuario t : AU.getUsuarios()) {
            txtA.append(t.toString() + "\n");

            Object[] row = {t.getCanal().getNombre(), t.getCanal().getCategoria(), t.getCanal().getSuscriptores()};
            model.addRow(row);

            for (Video j : t.getCanal().getPropios()) {
                Object[] r = {j.getNombre(), j.getRept(), j.getLikes(), j.getDislikes()};
                modelo.addRow(r);
            }
        }

        table_otherChannels.setModel(model);
        table_mysongs.setModel(modelo);
    }

    public void cleanTable() {
        table_nss.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Subtítulos"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_RegistrarUser = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        registrar_nombre = new javax.swing.JTextField();
        registrar_edad = new javax.swing.JSpinner();
        registrar_correo = new javax.swing.JTextField();
        registrar_usuario = new javax.swing.JTextField();
        registrar_contra = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jb_registrar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        registrar_canal = new javax.swing.JTextField();
        registrar_categoria = new javax.swing.JTextField();
        jd_VU = new javax.swing.JDialog();
        jLabel12 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tree = new javax.swing.JTree();
        jPanel4 = new javax.swing.JPanel();
        jt1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jt2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jt3 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jb_salir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_mysongs = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        nsong_name = new javax.swing.JTextField();
        nsong_tiempo = new javax.swing.JSpinner();
        nsong_subs = new javax.swing.JTextField();
        jb_addSub = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_nss = new javax.swing.JTable();
        jb_createVideo = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        table_otherChannels = new javax.swing.JTable();
        jb_subscribe = new javax.swing.JButton();
        jd_vistaUsuarios = new javax.swing.JDialog();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtA = new javax.swing.JTextArea();
        jd_Reproducir = new javax.swing.JDialog();
        rep_name = new javax.swing.JLabel();
        bar = new javax.swing.JProgressBar();
        jScrollPane8 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        rep_dur = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        PopUp = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        login_user = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        login_password = new javax.swing.JPasswordField();
        jb_login = new javax.swing.JButton();
        jb_register = new javax.swing.JButton();
        jb_verUsers = new javax.swing.JButton();

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel4.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel5.setText("Edad");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel6.setText("Correo");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel7.setText("Usuario");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel8.setText("Contraseña");

        registrar_edad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 50)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Registro");

        jb_registrar.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jb_registrar.setText("Registrar");
        jb_registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_registrarMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel10.setText("Canal");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel11.setText("Categoría");

        javax.swing.GroupLayout jd_RegistrarUserLayout = new javax.swing.GroupLayout(jd_RegistrarUser.getContentPane());
        jd_RegistrarUser.getContentPane().setLayout(jd_RegistrarUserLayout);
        jd_RegistrarUserLayout.setHorizontalGroup(
            jd_RegistrarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_RegistrarUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_RegistrarUserLayout.createSequentialGroup()
                .addGroup(jd_RegistrarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_RegistrarUserLayout.createSequentialGroup()
                        .addContainerGap(73, Short.MAX_VALUE)
                        .addGroup(jd_RegistrarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jd_RegistrarUserLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(registrar_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_RegistrarUserLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(registrar_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_RegistrarUserLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(registrar_correo))
                            .addGroup(jd_RegistrarUserLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(registrar_contra))
                            .addGroup(jd_RegistrarUserLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(registrar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_RegistrarUserLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(registrar_canal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jd_RegistrarUserLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(registrar_categoria)))
                .addGap(69, 69, 69))
            .addGroup(jd_RegistrarUserLayout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jb_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_RegistrarUserLayout.setVerticalGroup(
            jd_RegistrarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_RegistrarUserLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addGap(49, 49, 49)
                .addGroup(jd_RegistrarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrar_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jd_RegistrarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrar_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jd_RegistrarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrar_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jd_RegistrarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jd_RegistrarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrar_contra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jd_RegistrarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrar_canal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jd_RegistrarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrar_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jb_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 50)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("YouLeoTube");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Suscripciones");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Categorías");
        tree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        tree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                treeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tree);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jt1.setEditable(false);
        jt1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel14.setText("Suscriptores");

        jt2.setEditable(false);
        jt2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel16.setText("Likes");

        jt3.setEditable(false);
        jt3.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jt1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jt3)
                            .addComponent(jt2))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Mi Canal");

        jb_salir.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jb_salir.setText("Salir");
        jb_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jb_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jb_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Perfil", jPanel1);

        table_mysongs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Duración", "Likes", "Dislikes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_mysongs.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(table_mysongs);
        if (table_mysongs.getColumnModel().getColumnCount() > 0) {
            table_mysongs.getColumnModel().getColumn(0).setResizable(false);
            table_mysongs.getColumnModel().getColumn(1).setResizable(false);
            table_mysongs.getColumnModel().getColumn(2).setResizable(false);
            table_mysongs.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mis Videos", jPanel2);

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel20.setText("Nombre");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel21.setText("Tiempo de Reproducción");

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel22.setText("Subtítulos");

        nsong_tiempo.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        nsong_tiempo.setModel(new javax.swing.SpinnerNumberModel(10, 10, null, 1));

        jb_addSub.setText("Agregar");
        jb_addSub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_addSubMouseClicked(evt);
            }
        });

        table_nss.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subtítulos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_nss.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(table_nss);
        if (table_nss.getColumnModel().getColumnCount() > 0) {
            table_nss.getColumnModel().getColumn(0).setResizable(false);
        }

        jb_createVideo.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jb_createVideo.setText("Crear");
        jb_createVideo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_createVideoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nsong_name)
                                        .addComponent(nsong_subs, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nsong_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jb_addSub)))
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jb_createVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(388, 388, 388))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nsong_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nsong_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nsong_subs, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_addSub))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jb_createVideo)
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("Nuevo Video", jPanel3);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Duracion", "Creador"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jButton5.setText("Reproducir");

        jButton6.setText("Reproducir Playlist");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Favoritos", jPanel5);

        table_otherChannels.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Canal", "Categoría", "Suscriptores"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_otherChannels.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(table_otherChannels);
        if (table_otherChannels.getColumnModel().getColumnCount() > 0) {
            table_otherChannels.getColumnModel().getColumn(0).setResizable(false);
            table_otherChannels.getColumnModel().getColumn(1).setResizable(false);
            table_otherChannels.getColumnModel().getColumn(2).setResizable(false);
        }

        jb_subscribe.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jb_subscribe.setText("Suscribirse");
        jb_subscribe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_subscribeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(390, Short.MAX_VALUE)
                .addComponent(jb_subscribe)
                .addGap(385, 385, 385))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_subscribe)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Otros Canales", jPanel6);

        javax.swing.GroupLayout jd_VULayout = new javax.swing.GroupLayout(jd_VU.getContentPane());
        jd_VU.getContentPane().setLayout(jd_VULayout);
        jd_VULayout.setHorizontalGroup(
            jd_VULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_VULayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_VULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        jd_VULayout.setVerticalGroup(
            jd_VULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_VULayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtA.setEditable(false);
        txtA.setColumns(20);
        txtA.setRows(5);
        jScrollPane5.setViewportView(txtA);

        javax.swing.GroupLayout jd_vistaUsuariosLayout = new javax.swing.GroupLayout(jd_vistaUsuarios.getContentPane());
        jd_vistaUsuarios.getContentPane().setLayout(jd_vistaUsuariosLayout);
        jd_vistaUsuariosLayout.setHorizontalGroup(
            jd_vistaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_vistaUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        jd_vistaUsuariosLayout.setVerticalGroup(
            jd_vistaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_vistaUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );

        rep_name.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        rep_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rep_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        area.setColumns(20);
        area.setRows(5);
        jScrollPane8.setViewportView(area);

        rep_dur.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        rep_dur.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rep_dur.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("Reproducir");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_ReproducirLayout = new javax.swing.GroupLayout(jd_Reproducir.getContentPane());
        jd_Reproducir.getContentPane().setLayout(jd_ReproducirLayout);
        jd_ReproducirLayout.setHorizontalGroup(
            jd_ReproducirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ReproducirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_ReproducirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rep_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rep_dur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ReproducirLayout.createSequentialGroup()
                        .addGap(0, 34, Short.MAX_VALUE)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addComponent(bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jd_ReproducirLayout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_ReproducirLayout.setVerticalGroup(
            jd_ReproducirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ReproducirLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(rep_name, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rep_dur, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(14, 14, 14)
                .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jMenuItem1.setText("Reproducir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        PopUp.add(jMenuItem1);

        jMenuItem2.setText("Agegar a Favoritos");
        PopUp.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 50)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Usuario");

        login_user.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Contraseña");

        login_password.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        jb_login.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jb_login.setText("Ingresar");
        jb_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_loginMouseClicked(evt);
            }
        });

        jb_register.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jb_register.setText("Registrarse");
        jb_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_registerMouseClicked(evt);
            }
        });

        jb_verUsers.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jb_verUsers.setText("Ver Usuarios");
        jb_verUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_verUsersMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(login_user, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(login_password, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jb_register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jb_login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jb_verUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(login_user, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(login_password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jb_login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jb_register, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jb_verUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_registrarMouseClicked
        String n = registrar_nombre.getText();
        int e = (int) registrar_edad.getValue();
        String c = registrar_correo.getText();
        String u = registrar_usuario.getText();
        String p = registrar_contra.getText();
        String nc = registrar_canal.getText();
        String cc = registrar_categoria.getText().toUpperCase();
        Canal ch = new Canal(nc, cc);

        //AU.cargarArchivo();
        boolean read = false;
        for (Usuario f : cargados) {
            if (f.getCanal().getNombre().equals(u)) {
                read = true;
            }
        }

        if (n.equals("") || c.equals("") || u.equals("") || p.equals("") || nc.equals("") || cc.equals("") || read == true) {

        } else {
            Usuario nuevo = new Usuario(n, e, c, u, p, ch);

            AU.setUsuario(nuevo);
            AU.escribirArchivo();

            JOptionPane.showMessageDialog(this, "Usuario registrado exitosamente");
        }

        registrar_nombre.setText("");
        registrar_edad.setValue(0);
        registrar_correo.setText("");
        registrar_usuario.setText("");
        registrar_contra.setText("");
        registrar_canal.setText("");
        registrar_categoria.setText("");

        jd_RegistrarUser.setVisible(false);
    }//GEN-LAST:event_jb_registrarMouseClicked

    private void jb_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_loginMouseClicked
        String u = login_user.getText();
        String p = login_password.getText();

        AU.cargarArchivo();

        cargados = AU.getUsuarios();

        boolean pass = false;
        for (Usuario t : cargados) {
            if (u.equals(t.getUser()) && p.equals(t.getPassword())) {
                pass = true;
                actual = t;
            }
        }

        if (pass == true) {
            JOptionPane.showMessageDialog(this, "Bienvenido " + u);

            login_user.setText("");
            login_password.setText("");

            jt1.setText(actual.getUser());
            jt2.setText(Integer.toString(actual.getCanal().getSuscriptores()));
            jt3.setText(Integer.toString(actual.getCanal().getLikes()));

            jd_VU.setModal(true);
            jd_VU.pack();
            jd_VU.setLocationRelativeTo(this);
            jd_VU.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Usuario no registrado");

            login_user.setText("");
            login_password.setText("");
        }
        
        Tree();

    }//GEN-LAST:event_jb_loginMouseClicked

    private void jb_registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_registerMouseClicked
        jd_RegistrarUser.setModal(true);
        jd_RegistrarUser.pack();
        jd_RegistrarUser.setLocationRelativeTo(this);
        jd_RegistrarUser.setVisible(true);
    }//GEN-LAST:event_jb_registerMouseClicked

    private void jb_addSubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_addSubMouseClicked
        DefaultTableModel model = (DefaultTableModel) table_nss.getModel();
        duration = (int) nsong_tiempo.getValue();

        if (duration / 10 > model.getRowCount()) {
            Object[] v = {nsong_subs.getText()};
            model.addRow(v);
            table_nss.setModel(model);
        } else {
            JOptionPane.showMessageDialog(this, "La duración de este video no permite más comentarios");
        }

        nsong_subs.setText("");
    }//GEN-LAST:event_jb_addSubMouseClicked

    private void jb_verUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_verUsersMouseClicked
        jd_vistaUsuarios.setModal(true);
        jd_vistaUsuarios.pack();
        jd_vistaUsuarios.setLocationRelativeTo(this);
        jd_vistaUsuarios.setVisible(true);
    }//GEN-LAST:event_jb_verUsersMouseClicked

    private void jb_createVideoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_createVideoMouseClicked
        String n = nsong_name.getText();
        int d = (int) nsong_tiempo.getValue();

        Video v = new Video(n, d, 0, 0);

        actual.getCanal().getPropios().add(v);

        int place = actual.getCanal().getPropios().indexOf(v);

        DefaultTableModel modelo = (DefaultTableModel) table_nss.getModel();
        for (int i = 0; i < table_nss.getRowCount(); i++) {
            actual.getCanal().getPropios().get(place).getComments().add((String) modelo.getValueAt(i, 0));
        }

        DefaultTableModel model = (DefaultTableModel) table_mysongs.getModel();
        Object[] o = {n, d};
        model.addRow(o);
        table_mysongs.setModel(model);

        AU.escribirArchivo();

        nsong_name.setText("");
        nsong_tiempo.setValue(0);
        cleanTable();
    }//GEN-LAST:event_jb_createVideoMouseClicked

    private void jb_subscribeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_subscribeMouseClicked
        //AU.cargarArchivo();
        try {
            int pos = table_otherChannels.getSelectedRow();

            String chan = table_otherChannels.getValueAt(pos, 0).toString();

            boolean marcela = false;
            for (Usuario t : AU.getUsuarios()) {
                if (t.getCanal().getNombre().equals(chan)) {
                    boneless = t;
                    marcela = true;
                }
            }

            if (marcela) {
                actual.getCanales().add(boneless.getCanal());
                Tree();
                AU.escribirArchivo();
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un canal para poder suscribirse");
        }

    }//GEN-LAST:event_jb_subscribeMouseClicked

    public void Tree() {
        try {
        cleanTree();
        DefaultTreeModel modelo = (DefaultTreeModel) tree.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelo.getRoot();
        DefaultMutableTreeNode category = null;

        for (Canal k : actual.getCanales()) {
            if (raiz.getChildCount() == 0) {
                category = new DefaultMutableTreeNode(k.getCategoria());
                DefaultMutableTreeNode channel = new DefaultMutableTreeNode(k);
                if (k.getPropios().isEmpty()) {
                } else {
                    for (Video v : k.getPropios()) {
                        DefaultMutableTreeNode video = new DefaultMutableTreeNode(v);
                        channel.add(video);
                    }
                }
                category.add(channel);
                raiz.add(category);
            } else {
                boolean distress = true;
                for (int i = 0; i < raiz.getChildCount(); i++) {
                    if (k.getCategoria().equals(raiz.getChildAt(i))) {
                        distress = false;
                        este = i;
                        break;
                    }
                }

                if (distress) {
                     category = new DefaultMutableTreeNode(k.getCategoria());
                    DefaultMutableTreeNode channel = new DefaultMutableTreeNode(k);
                    if (k.getPropios().isEmpty()) {
                    } else {
                        for (Video v : k.getPropios()) {
                            DefaultMutableTreeNode video = new DefaultMutableTreeNode(v);
                            channel.add(video);
                        }
                    }
                    category.add(channel);
                    raiz.add(category);
                } else {
                    DefaultMutableTreeNode channel = new DefaultMutableTreeNode(k);
                     category = (DefaultMutableTreeNode) raiz.getChildAt(este);
                    if (k.getPropios().isEmpty()) {
                    } else {
                        for (Video v : k.getPropios()) {
                            DefaultMutableTreeNode video = new DefaultMutableTreeNode(v);
                            channel.add(video);
                        }
                    }
                    category.add(channel);
                    raiz.add(category);
                }

            }
        }
        } catch (Exception e) {
            
        }
    }

    private void jb_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirMouseClicked

        jd_VU.dispose();
    }//GEN-LAST:event_jb_salirMouseClicked

    public void cleanTree() {
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Categorías");
        tree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
    }
    
    private void treeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_treeMouseClicked
        if (evt.isMetaDown()) {
            int row = tree.getClosestRowForLocation(evt.getX(), evt.getY());
            tree.setSelectionRow(row);
            Object v1 = tree.getSelectionPath().getLastPathComponent();
            ns = (DefaultMutableTreeNode) v1;

            if (ns.getUserObject() instanceof Video) {
                vhs = (Video) ns.getUserObject();
                PopUp.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_treeMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        rep_name.setText(vhs.getNombre());
        rep_dur.setText(Integer.toString(vhs.getRept()));
        
        jd_Reproducir.setModal(true);
        jd_Reproducir.pack();
        jd_Reproducir.setLocationRelativeTo(this);
        jd_Reproducir.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        hv = new Hilo_Video(bar, area, vhs);
        hv.start();
    }//GEN-LAST:event_jButton1MouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu PopUp;
    private javax.swing.JTextArea area;
    private javax.swing.JProgressBar bar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jb_addSub;
    private javax.swing.JButton jb_createVideo;
    private javax.swing.JButton jb_login;
    private javax.swing.JButton jb_register;
    private javax.swing.JButton jb_registrar;
    private javax.swing.JButton jb_salir;
    private javax.swing.JButton jb_subscribe;
    private javax.swing.JButton jb_verUsers;
    private javax.swing.JDialog jd_RegistrarUser;
    private javax.swing.JDialog jd_Reproducir;
    private javax.swing.JDialog jd_VU;
    private javax.swing.JDialog jd_vistaUsuarios;
    private javax.swing.JTextField jt1;
    private javax.swing.JTextField jt2;
    private javax.swing.JTextField jt3;
    private javax.swing.JPasswordField login_password;
    private javax.swing.JTextField login_user;
    private javax.swing.JTextField nsong_name;
    private javax.swing.JTextField nsong_subs;
    private javax.swing.JSpinner nsong_tiempo;
    private javax.swing.JTextField registrar_canal;
    private javax.swing.JTextField registrar_categoria;
    private javax.swing.JPasswordField registrar_contra;
    private javax.swing.JTextField registrar_correo;
    private javax.swing.JSpinner registrar_edad;
    private javax.swing.JTextField registrar_nombre;
    private javax.swing.JTextField registrar_usuario;
    private javax.swing.JLabel rep_dur;
    private javax.swing.JLabel rep_name;
    private javax.swing.JTable table_mysongs;
    private javax.swing.JTable table_nss;
    private javax.swing.JTable table_otherChannels;
    private javax.swing.JTree tree;
    private javax.swing.JTextArea txtA;
    // End of variables declaration//GEN-END:variables
    adminUsuarios AU = new adminUsuarios("./Usuarios.gvs");
    ArrayList<Usuario> cargados = new ArrayList();
    int duration;
    Usuario actual;
    Usuario boneless;
    int este;
//    DefaultMutableTreeNode category;
//    DefaultMutableTreeNode channel;
//    DefaultMutableTreeNode video;
    DefaultMutableTreeNode ns;
    Video vhs;
    Hilo_Video hv;
}
