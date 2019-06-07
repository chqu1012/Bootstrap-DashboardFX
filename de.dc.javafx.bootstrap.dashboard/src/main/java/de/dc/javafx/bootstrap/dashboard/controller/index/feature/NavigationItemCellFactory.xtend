package de.dc.javafx.bootstrap.dashboard.controller.index.feature

import javafx.fxml.FXMLLoader
import de.dc.javafx.bootstrap.dashboard.controller.index.model.NavigationItem
import de.dc.javafx.bootstrap.dashboard.controller.index.control.BaseNavigationItemController

class NavigationItemCellFactory extends BaseNavigationItemController {
	
	override protected updateItem(NavigationItem item, boolean empty) {
		super.updateItem(item, empty)
		if(empty || item === null) {
            setText(null)
            setGraphic(null)

        } else {
            if (mLLoader === null) {
                mLLoader = new FXMLLoader(getClass().getResource("/de/dc/javafx/bootstrap/dashboard/inde/control/NavigationItem.fxml"))
                mLLoader.setController(this)
                mLLoader.load

            }

        	nameLabel.text = item.name
//			iconImageView.glyphName = item.icon

            setText(null)
            setGraphic(root)
        }
	}
	
}
