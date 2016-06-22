s =  box.space.test
if not s then
    s = box.schema.space.create('test')
    p = s:create_index('primary', {type = 'tree', parts = {1, 'NUM'}})
    for i = 1, 12 do
        s:insert({i, i})
    end
end