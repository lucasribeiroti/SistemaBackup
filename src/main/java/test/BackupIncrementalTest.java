package src.main.java.test;

import org.junit.jupiter.api.Test;
import src.main.java.BackupIncremental;
import src.main.java.BackupLocal;
import src.main.java.BackupNuvem;
import src.main.java.BackupService;

import static org.junit.jupiter.api.Assertions.*;

class BackupIncrementalTest {

    @Test
    void deveRealizarBackupIncrementalComBackupLocal() {
        BackupService backupService = new BackupLocal();
        BackupIncremental backupIncremental = new BackupIncremental(backupService);
        assertEquals("Realizando backup incremental local.", backupIncremental.realizarBackup());
    }

    @Test
    void deveRealizarBackupIncrementalComBackupNuvem() {
        BackupService backupService = new BackupNuvem();
        BackupIncremental backupIncremental = new BackupIncremental(backupService);
        assertEquals("Realizando backup incremental na nuvem.", backupIncremental.realizarBackup());
    }
}