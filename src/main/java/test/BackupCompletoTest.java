package src.main.java.test;

import org.junit.jupiter.api.Test;
import src.main.java.BackupCompleto;
import src.main.java.BackupLocal;
import src.main.java.BackupNuvem;
import src.main.java.BackupService;

import static org.junit.jupiter.api.Assertions.*;

class BackupCompletoTest {

    @Test
    void deveRealizarBackupCompletoComBackupLocal() {
        BackupService backupService = new BackupLocal();
        BackupCompleto backupCompleto = new BackupCompleto(backupService);
        assertEquals("Realizando backup completo local.", backupCompleto.realizarBackup());
    }

    @Test
    void deveRealizarBackupCompletoComBackupNuvem() {
        BackupService backupService = new BackupNuvem();
        BackupCompleto backupCompleto = new BackupCompleto(backupService);
        assertEquals("Realizando backup completo na nuvem.", backupCompleto.realizarBackup());
    }
}
