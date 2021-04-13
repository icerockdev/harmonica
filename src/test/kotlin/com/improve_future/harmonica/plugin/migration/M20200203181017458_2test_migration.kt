package com.improve_future.harmonica.plugin.migration

import com.improve_future.harmonica.core.AbstractMigration

class M20200203181017458_2test_migration : AbstractMigration() {
    override fun up() {
        createTable("refresh_token_d") {
            id = false
            text("token", nullable = false)
            integer("entity_id", nullable = false)
            integer("entity_type", nullable = false)
            dateTime("expired_at", nullable = false)
        }
        executeSql("ALTER TABLE refresh_token_d ADD CONSTRAINT PK_refresh_token_d PRIMARY KEY (token)")
    }

    override fun down() {
        dropTable("refresh_token_d")
    }
}
