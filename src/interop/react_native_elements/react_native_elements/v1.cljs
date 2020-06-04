(ns interop.react-native-elements.react-native-elements.v1
  (:require [react-native-elements :as module]
            [reagent.core :as r]))

(assert module)

; https://github.com/react-native-elements/react-native-elements/blob/next/src/index.js

(def badge (r/adapt-react-class module/Badge))
(def button (r/adapt-react-class module/Button))
(def button-group (r/adapt-react-class module/ButtonGroup))
(def card (r/adapt-react-class module/Card))
(def input (r/adapt-react-class module/Input))
(def list-item (r/adapt-react-class module/ListItem))
(def pricing-card (r/adapt-react-class module/PricingCard))
(def tooltip (r/adapt-react-class module/Tooltip))
(def social-icon (r/adapt-react-class module/SocialIcon))
(def text (r/adapt-react-class module/Text))
(def divider (r/adapt-react-class module/Divider))
(def check-box (r/adapt-react-class module/CheckBox))
(def search-bar (r/adapt-react-class module/SearchBar))
(def icon (r/adapt-react-class module/Icon))
(def tile (r/adapt-react-class module/Tile))
(def slider (r/adapt-react-class module/Slider))
(def avatar (r/adapt-react-class module/Avatar))
(def rating (r/adapt-react-class module/Rating))
(def airbnb-rating (r/adapt-react-class module/AirbnbRating))
(def header (r/adapt-react-class module/Header))
(def overlay (r/adapt-react-class module/Overlay))
(def theme-provider (r/adapt-react-class module/ThemeProvider))
(def theme-consumer (r/adapt-react-class module/ThemeConsumer))
(def theme-context (r/adapt-react-class module/ThemeContext))
(def image (r/adapt-react-class module/Image))

(def colors module/colors)
(def getIconType module/getIconType)
(def registerCustomIconType module/registerCustomIconType)
(def normalize module/normalize)
(def withBadge module/withBadge)
(def withTheme module/withTheme)

