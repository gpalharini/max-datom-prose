:level-9 {:english {:level-title "Level 9"
                    :paragraph-1 (str "Human " applicant-name ", a ")
                    :paragraph-1.1 "collection binding"
                    :paragraph-1.2 " binds a single variable to multiple values passed in as a collection. Using the "
                    :paragraph-1.3 "[variable ...]"
                    :paragraph-1.4 " syntax this can be used to ask \"or\" questions such as what is the capacity and address associated with farms named either 'Power From the People' or 'The Big Wheel'?"
                    :paragraph-2 "(d/q '[:find (pull ?e [:farm/capacity :farm/address])\n       :in $ [?farm-name ...]\n       :where [?e :farm/name ?farm-name]] db [\"Power From the People\" \"The Big Wheel\"])"
                    :paragraph-3 "Modify the query to use the author-ids as an input to the query in order to retrieve the "
                    :paragraph-3.1 "first"
                    :paragraph-3.2 " and "
                    :paragraph-3.3 "last"
                    :paragraph-3.4 " names of both authors."
                    :paragraph-4 "You may now continue to level 10."}}
