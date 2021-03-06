﻿using SanicBeats.Sound;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace SanicBeats.UI
{
    /// <summary>
    /// Interaction logic for ImportPanel.xaml
    /// </summary>
    public partial class ImportPanel : UserControl
    {

        public AudioEngine Engine;

        public ImportPanel()
        {
            InitializeComponent();
        }

        private void OnDrop(object sender, DragEventArgs e)
        {
            if (e.Data.GetDataPresent(DataFormats.FileDrop))
            {
                string[] files = (string[])e.Data.GetData(DataFormats.FileDrop);
                Console.WriteLine($"{files[0]}");
                Engine?.OpenFile(files[0]);
            }
        }
    }
}
